package com.campuscafe.ordering.domain.model;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void negativeMoneyIsNotAllowed() {
        assertThrows(IllegalArgumentException.class,
                () -> new Money(new BigDecimal("-50")));
    }
}