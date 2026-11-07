package com.campuscafe.ordering.adapter.out.persistence;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class OrderJpaEntity {

    @Id
    private UUID id;
    private String status;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "order_id", nullable = false)
    private List<OrderLineJpaEntity> lines = new ArrayList<>();

    protected OrderJpaEntity() {}

    public OrderJpaEntity(UUID id, String status, List<OrderLineJpaEntity> lines) {
        this.id = id;
        this.status = status;
        this.lines = lines;
    }

    public UUID getId() { return id; }
    public String getStatus() { return status; }
    public List<OrderLineJpaEntity> getLines() { return lines; }
}
