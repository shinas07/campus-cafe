package com.campuscafe.ordering.domain.model;

public record OrderLine(String itemName, int quantity, Money price) {

}
