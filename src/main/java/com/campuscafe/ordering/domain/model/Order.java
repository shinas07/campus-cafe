package com.campuscafe.ordering.domain.model;

import com.campuscafe.ordering.domain.exception.OrderRuleException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private final OrderId id;
    private OrderStatus status;
    private final List<OrderLine> lines = new ArrayList<>();


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
