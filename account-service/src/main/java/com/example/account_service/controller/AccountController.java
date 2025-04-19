package com.example.account_service.controller;

import com.example.account_service.entity.Account;
import com.example.account_service.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;


    public AccountController(AccountService accountService) {

        this.accountService = accountService;
    }
    @GetMapping
    private List<Account> getAllAccounts(){

        return accountService.getAllAccounts();
    }

    @PostMapping("/saveAccount")
    public Account saveAccount(@RequestBody Account account){

        return accountService.saveAccount(account);
    }

    @GetMapping("/{userId}")
    public Optional<Account> getAccountsByUserId(@PathVariable Integer userId){
        return accountService.getAccountsByUserId(userId);
    }



}
