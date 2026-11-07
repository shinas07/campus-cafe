package com.campuscafe.ordering.domain.exception;

public class OrderRuleException extends  RuntimeException{
    public OrderRuleException(String message){
        super(message);
    }
}
