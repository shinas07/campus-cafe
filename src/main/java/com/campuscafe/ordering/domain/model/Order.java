package com.campuscafe.ordering.domain.model;

import com.campuscafe.ordering.domain.exception.OrderRuleException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private final OrderId id;
    private OrderStatus status;
    private final List<OrderLine> lines = new ArrayList<>();
    private static final int MAX_SPECIAL = 3;

    public List<OrderLine> lines(){
        return List.copyOf(lines);
    }

    public static Order reconstitute(OrderId id, OrderStatus status, List<OrderLine> lines){
        Order order = new Order(id);
        order.status = status;
        order.lines.addAll(lines);
        return order;
    }

    private Order(OrderId id){
        this.id = id;
        this.status = OrderStatus.NEW;
    }

    public static Order create(){
        return new Order(new OrderId(UUID.randomUUID()));
    }

    public void pay(){
        requireNew();
        if (lines.isEmpty()){
            throw new OrderRuleException("there is no product to buy");
        }


        status = OrderStatus.PAID;
    }

    public void addItem(String itemName, int quantity, Money price){
        requireNew();
        if (itemName.equals("Daily Special")){
            int alreadyOrdered = lines.stream()
                    .filter(line -> line.itemName().equals("Daily Special"))
                    .mapToInt(OrderLine::quantity)
                    .sum();
            if (alreadyOrdered + quantity > MAX_SPECIAL){
                throw new OrderRuleException("Max " + MAX_SPECIAL + " Daily Special per order");
            }
        }
        lines.add(new OrderLine(itemName, quantity, price));
    }

    private void requireNew(){
        if (status != OrderStatus.NEW){
            throw new OrderRuleException("Order is already" + status);
        }
    }

    public OrderId id(){
        return id;
    }

    public OrderStatus status(){
        return  status;
    }

}
