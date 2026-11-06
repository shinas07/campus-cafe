package com.campuscafe.ordering.domain.model;


import java.math.BigDecimal;


public record Money(BigDecimal amount) {

    public Money {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
}
