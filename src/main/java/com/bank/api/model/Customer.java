package com.bank.api.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String pan;

    @Column(unique = true)
    private String aadhaar;

    private LocalDate dob;

    private String kycStatus;

    private Integer riskScore;
    
    @OneToMany(mappedBy = "customer")
    private List<Account> accounts;

    private LocalDateTime createdAt;
}
