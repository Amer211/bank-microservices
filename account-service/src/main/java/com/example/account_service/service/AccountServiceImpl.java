package com.example.account_service.service;

import com.example.account_service.entity.Account;
import com.example.account_service.repository.AccountRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    private final Logger logger = LogManager.getLogger(AccountServiceImpl.class);

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {

        this.accountRepository = accountRepository;
    }


    @Override
    public Account saveAccount(Account account) {
        accountRepository.save(account);
        logger.info("New Account :{} has been created.",account.getAccountNumber());

        return account;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> getAccountsByUserId(Integer userId) {
        return accountRepository.findById(userId);
    }


}
