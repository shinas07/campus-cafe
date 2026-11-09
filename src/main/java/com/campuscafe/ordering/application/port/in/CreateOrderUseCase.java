package com.campuscafe.ordering.application.port.in;

import com.campuscafe.ordering.domain.model.OrderId;
import java.math.BigDecimal;

public interface CreateOrderUseCase {
    OrderId create(String itemName, int quantity, BigDecimal price);
}
