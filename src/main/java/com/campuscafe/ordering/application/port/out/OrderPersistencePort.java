package com.campuscafe.ordering.application.port.out;
import com.campuscafe.ordering.domain.model.Order;
import com.campuscafe.ordering.domain.model.OrderId;
import java.util.Optional;

public interface OrderPersistencePort {
    void save(Order order);
    Optional<Order> findById(OrderId id);
}
