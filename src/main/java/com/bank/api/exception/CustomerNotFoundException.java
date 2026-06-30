package com.bank.api.exception;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String customerNumber) {
        super("Customer not found with customer number : " + customerNumber);
    }
}