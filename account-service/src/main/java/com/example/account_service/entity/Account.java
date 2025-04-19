package com.example.account_service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
import java.util.Random;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    @Column(nullable = false,unique = true)
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

    @PrePersist
    private void generateAccountNumber() {
        if (this.accountNumber == null || this.accountNumber.isEmpty()) {
            this.accountNumber = accountNumberGenerator();
        }
    }

    private String accountNumberGenerator() {
        StringBuilder account = new StringBuilder();
        Random random = new Random();

        for(int i =0; i<8;i++){
            int digit = random.nextInt(10);
            account.append(digit);
        }

        return account.toString();
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
