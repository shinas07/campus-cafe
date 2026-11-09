package com.campuscafe.kitchen.adapter.in.event;

import com.campuscafe.ordering.domain.event.OrderPaidEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderPaidListener {
    @EventListener
    public void on(OrderPaidEvent event){
        System.out.println("Kitech: start cooping order" + event.orderId().id());
    }
}
