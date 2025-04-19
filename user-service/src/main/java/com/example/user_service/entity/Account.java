package com.example.user_service.entity;


import jakarta.persistence.Column;

import java.util.Objects;

public class Account {

    private Integer accountId;

    private String accountNumber;

    @Column
    private Integer userId;

    public Account() {
    }

    public Account(Integer accountId, String accountNumber, Integer userId) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.userId = userId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountId, account.accountId) && Objects.equals(accountNumber, account.accountNumber) && Objects.equals(userId, account.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountNumber, userId);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountNumber='" + accountNumber + '\'' +
                ", userId=" + userId +
                '}';
    }
}

