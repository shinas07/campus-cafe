package com.campuscafe.ordering.application.usecase;

import com.campuscafe.ordering.application.port.in.PayOrderUseCase;
import com.campuscafe.ordering.application.port.out.OrderPersistencePort;
import com.campuscafe.ordering.domain.exception.OrderNotFoundException;
import com.campuscafe.ordering.domain.model.Order;
import com.campuscafe.ordering.domain.model.OrderId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PayOrderService implements PayOrderUseCase {
    private final OrderPersistencePort orders;

    public PayOrderService(OrderPersistencePort orders){
        this.orders = orders;
    }

    @Override
    @Transactional
    public void pay(OrderId id){
        Order order = orders.findById(id).orElseThrow(() -> new OrderNotFoundException("Order not found: " + id.id()));
        order.pay();
        orders.save(order);
    }
}
