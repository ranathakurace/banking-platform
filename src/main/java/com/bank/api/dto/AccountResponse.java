package com.bank.api.dto;

public class AccountResponse {

	private Long accountId;
    private double balance;
    private String currency;
    private String status;

    public AccountResponse(Long accountId,
            double balance,
            String currency,
            String status) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.status = status;
    }

    public Long getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getStatus() {
        return status;
    }
}
