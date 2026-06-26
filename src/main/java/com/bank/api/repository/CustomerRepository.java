package com.bank.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.api.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
