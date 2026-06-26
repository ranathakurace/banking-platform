package com.bank.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.api.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
