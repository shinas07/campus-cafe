package com.campuscafe.ordering.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "order_lines")
public class OrderLineJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemName;
    private int quantity;
    private BigDecimal price;

    protected OrderLineJpaEntity() {}

    public OrderLineJpaEntity(String itemName, int quantity, BigDecimal price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public BigDecimal getPrice() { return price; }
}
