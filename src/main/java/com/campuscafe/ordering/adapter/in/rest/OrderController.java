package com.campuscafe.ordering.adapter.in.rest;

import com.campuscafe.ordering.application.usecase.CreateOrderService;
import com.campuscafe.ordering.application.usecase.PayOrderService;
import com.campuscafe.ordering.domain.model.OrderId;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final CreateOrderService createOrder;
    private final PayOrderService payOrder;

    public OrderController(CreateOrderService createOrder, PayOrderService payOrder){
        this.createOrder = createOrder;
        this.payOrder = payOrder;
    }

    record CreateOrderRequest(String itemName, int quantity, BigDecimal price) {}


    @PostMapping
    public UUID create(@RequestBody CreateOrderRequest req) {
        return createOrder.create(req.itemName(), req.quantity(), req.price()).id();
    }

    @PostMapping("/{id}/pay")
    public String pay(@PathVariable UUID id){
        payOrder.pay(new OrderId(id));
        return "PAID";
    }
}