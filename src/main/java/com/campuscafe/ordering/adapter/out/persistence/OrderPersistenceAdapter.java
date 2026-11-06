package com.campuscafe.ordering.adapter.out.persistence;


import com.campuscafe.ordering.application.port.out.OrderPersistencePort;
import com.campuscafe.ordering.domain.model.Order;
import com.campuscafe.ordering.domain.model.OrderId;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class OrderPersistenceAdapter implements OrderPersistencePort{

    private final Map<OrderId, Order> store = new HashMap<>();

    @Override
    public void save(Order order){
        store.put(order.id(), order);
    }

    @Override
    public Optional<Order> findById(OrderId id){
        return Optional.ofNullable(store.get(id));
    }
}
