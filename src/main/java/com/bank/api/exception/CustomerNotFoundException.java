package com.bank.api.exception;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String field, String value) {
        super("Customer not found with " + field + " : " + value);
    }
}