package com.bank.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bank.api.dto.CustomerRequest;
import com.bank.api.dto.CustomerResponse;
import com.bank.api.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * ==========================================================
     * Story-001
     * Enterprise Customer Registration
     * ==========================================================
     */
    @PostMapping("/register")
    public ResponseEntity<CustomerResponse> registerCustomer(
            @RequestBody CustomerRequest request) {

        CustomerResponse response =
                customerService.register(request);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}