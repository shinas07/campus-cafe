package com.campuscafe.ordering.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final OrderId id;
    private OrderStatus status;
    private final List<OrderLine> lines = new ArrayList<>();


    public Order(OrderId id){
        this.id = id;
        this.status = OrderStatus.NEW;
    }

    public void pay(){
        if (status != OrderStatus.NEW){
            throw new IllegalStateException("Only a NEW order can be paid");
        }
        status = OrderStatus.PAID;
    }

    public void addItem(String itemName, int quantity, Money price){
        if (status != OrderStatus.NEW){
            throw new IllegalStateException("Can't change a paid order");
        }
        lines.add(new OrderLine(itemName, quantity, price));
    }



}
