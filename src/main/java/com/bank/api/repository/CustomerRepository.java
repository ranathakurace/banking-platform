package com.bank.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.api.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    boolean existsByPan(String pan);

    boolean existsByAadhaar(String aadhaar);

    boolean existsByEmail(String email);

    boolean existsByPhone(String phone);

    boolean existsByCustomerNumber(String customerNumber);

    Optional<Customer> findByCustomerNumber(String customerNumber);
    
    @Query(value = "SELECT nextval('customer_sequence')", nativeQuery = true)
    Long getNextCustomerSequence();

}