package com.campuscafe.ordering.domain.event;

import com.campuscafe.ordering.domain.model.OrderId;
public record OrderPaidEvent(OrderId orderId) {

}
