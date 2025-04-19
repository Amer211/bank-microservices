package com.example.account_service.service;

import com.example.account_service.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    Account saveAccount(Account account);
    List<Account> getAllAccounts();

    Optional<Account> getAccountsByUserId(Integer userId);
    //List<Account> findAccountByUserId(Integer userId);
}
