package com.campuscafe.kitchen.adapter.in.event;

import com.campuscafe.ordering.domain.event.OrderPaidEvent;

import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class OrderPaidListener {
    @TransactionalEventListener
    public void on(OrderPaidEvent event){
        System.out.println("Kitech: start cooping order" + event.orderId().id());
    }
}
