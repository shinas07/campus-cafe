package com.campuscafe.ordering.application.port.in;

import com.campuscafe.ordering.domain.model.OrderId;

public interface PayOrderUseCase {
    void pay(OrderId id);
}
