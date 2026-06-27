package com.bank.api.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.api.dto.CustomerRequest;
import com.bank.api.dto.CustomerResponse;
import com.bank.api.model.Customer;
import com.bank.api.model.CustomerStatus;
import com.bank.api.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    private Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
    public CustomerResponse register(CustomerRequest request) {

    	/*
    	 * =========================================================
    	 * Step 1 : Validate Request
    	 * =========================================================
    	 */

    	if (request == null) {
    	    throw new IllegalArgumentException("Customer request cannot be null.");
    	}

    	if (request.getFullName() == null || request.getFullName().trim().isEmpty()) {
    	    throw new IllegalArgumentException("Full Name is mandatory.");
    	}

    	if (request.getEmail() == null || request.getEmail().trim().isEmpty()) {
    		throw new IllegalArgumentException("Email is mandatory.");
    	}

    	if (request.getPhone() == null || request.getPhone().trim().isEmpty()) {
    		throw new IllegalArgumentException("PAN is mandatory.");
    	}

    	if (request.getPan() == null || request.getPan().trim().isEmpty()) {
    		throw new IllegalArgumentException("Aadhaar Number is mandatory.");
    	}

    	if (request.getAadhaar() == null || request.getAadhaar().trim().isEmpty()) {
    	    throw new IllegalArgumentException("Aadhaar Number is required.");
    	}

    	if (request.getDob() == null) {
    	    throw new IllegalArgumentException("Date of Birth is mandatory.");
    	}

    	if (request.getDob().isAfter(LocalDate.now().minusYears(18))) {
    	    throw new IllegalArgumentException("Customer must be at least 18 years old.");
    	}


    	/*
    	 * ==========================================================
    	 * Step 2 : Check Duplicate Customer Information
    	 * ==========================================================
    	 *
    	 * Enterprise Validation
    	 * ---------------------
    	 * PAN
    	 * Aadhaar
    	 * Email
    	 * Phone
    	 *
    	 */

    	if (customerRepository.existsByPan(request.getPan())) {
    	    throw new IllegalArgumentException("PAN already registered.");
    	}

    	if (customerRepository.existsByAadhaar(request.getAadhaar())) {
    	    throw new IllegalArgumentException("Aadhaar already registered.");
    	}

    	if (customerRepository.existsByEmail(request.getEmail())) {
    	    throw new IllegalArgumentException("Email already registered.");
    	}

    	if (customerRepository.existsByPhone(request.getPhone())) {
    	    throw new IllegalArgumentException("Phone Number already registered.");
    	}

    	/*
    	 * ==========================================================
    	 * Step 3 : Generate Customer Number
    	 * ==========================================================
    	 */
    	
    	Long sequenceNumber = customerRepository.getNextCustomerSequence();

    	String customerNumber = String.format("CUST%06d", sequenceNumber);

        /*
         * =========================================================
         * Step 4 : Create Customer Entity
         * =========================================================
         */
    	Customer customer = new Customer();

    	customer.setCustomerNumber(customerNumber);

    	customer.setFullName(request.getFullName());

    	customer.setEmail(request.getEmail());

    	customer.setPhone(request.getPhone());

    	customer.setPan(request.getPan());

    	customer.setAadhaar(request.getAadhaar());

    	customer.setDob(request.getDob());

    	/*
    	 * ===============================================================
    	 * Step 4.1 : Initialize Enterprise Defaults
    	 * ===============================================================
    	 */

    	customer.setCustomerStatus(CustomerStatus.PENDING_KYC);

    	customer.setKycStatus("PENDING");

    	customer.setRiskScore(0);

    	customer.setCreatedAt(LocalDateTime.now());

    	customer.setUpdatedAt(LocalDateTime.now());
    	
        /*
         * =========================================================
         * Step 5 : Save Customer
         * =========================================================
         */
    	Customer savedCustomer = saveCustomer(customer);	

        /*
         * =========================================================
         * Step 6 : Build Response
         * =========================================================
         */

    	CustomerResponse response = new CustomerResponse();

    	response.setCustomerNumber(savedCustomer.getCustomerNumber());

    	response.setFullName(savedCustomer.getFullName());

    	response.setCustomerStatus(savedCustomer.getCustomerStatus().name());

    	response.setKycStatus(savedCustomer.getKycStatus());

    	response.setMessage("Customer registered successfully.");

    	return response;
    }
}