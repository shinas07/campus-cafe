package com.campuscafe.ordering.application.usecase;

import com.campuscafe.ordering.application.port.out.OrderPersistencePort;
import com.campuscafe.ordering.domain.model.Money;
import com.campuscafe.ordering.domain.model.Order;
import com.campuscafe.ordering.domain.model.OrderId;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CreateOrderService {
    private final OrderPersistencePort orders;

    public CreateOrderService(OrderPersistencePort orders){
        this.orders = orders;
    }

    public OrderId create(String itemName, int quantity, BigDecimal price){
        Order order = Order.create();
        order.addItem(itemName, quantity, new Money(price));
        orders.save(order);
        return order.id();
    }

}
