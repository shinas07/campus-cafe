package com.campuscafe.ordering.application.usecase;

import com.campuscafe.ordering.application.port.out.OrderPersistencePort;
import com.campuscafe.ordering.domain.model.Order;
import com.campuscafe.ordering.domain.model.OrderId;
import org.springframework.stereotype.Service;

@Service
public class PayOrderService{
    private final OrderPersistencePort orders;

    public PayOrderService(OrderPersistencePort orders){
        this.orders = orders;
    }

    public void pay(OrderId id){
        Order order = orders.findById(id).orElseThrow(() -> new IllegalArgumentException("Order not found"));
        order.pay();
        orders.save(order);
    }
}
