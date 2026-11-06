package com.campuscafe;

import com.campuscafe.ordering.domain.model.Money;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class CampusCafeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusCafeApplication.class, args);

        Money a = new Money(new BigDecimal("50"));
        Money b = new Money(new BigDecimal("50"));
        System.out.println(a.equals(b));
    }
}
