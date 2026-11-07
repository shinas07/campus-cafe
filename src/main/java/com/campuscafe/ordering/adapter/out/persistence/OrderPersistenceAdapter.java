package com.campuscafe.ordering.adapter.out.persistence;

import com.campuscafe.ordering.application.port.out.OrderPersistencePort;
import com.campuscafe.ordering.domain.model.Order;
import com.campuscafe.ordering.domain.model.OrderId;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderPersistenceAdapter implements OrderPersistencePort {

    private final OrderJpaRepository repository;
    private final OrderJpaMapper mapper;

    public OrderPersistenceAdapter(OrderJpaRepository repository, OrderJpaMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void save(Order order) {
        repository.save(mapper.toEntity(order));
    }

    @Override
    public Optional<Order> findById(OrderId id) {
        return repository.findById(id.id()).map(mapper::toDomain);
    }
}
