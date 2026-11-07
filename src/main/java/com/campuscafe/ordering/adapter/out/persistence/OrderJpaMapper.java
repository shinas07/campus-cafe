package com.campuscafe.ordering.adapter.out.persistence;

import com.campuscafe.ordering.domain.model.Money;
import com.campuscafe.ordering.domain.model.Order;
import com.campuscafe.ordering.domain.model.OrderId;
import com.campuscafe.ordering.domain.model.OrderLine;
import com.campuscafe.ordering.domain.model.OrderStatus;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderJpaMapper {

    public OrderJpaEntity toEntity(Order order) {
        List<OrderLineJpaEntity> lines = order.lines().stream()
                .map(l -> new OrderLineJpaEntity(l.itemName(), l.quantity(), l.price().amount()))
                .collect(Collectors.toCollection(ArrayList::new));
        return new OrderJpaEntity(order.id().id(), order.status().name(), lines);
    }

    public Order toDomain(OrderJpaEntity e) {
        List<OrderLine> lines = e.getLines().stream()
                .map(l -> new OrderLine(l.getItemName(), l.getQuantity(), new Money(l.getPrice())))
                .toList();
        return Order.reconstitute(new OrderId(e.getId()), OrderStatus.valueOf(e.getStatus()), lines);
    }
}
