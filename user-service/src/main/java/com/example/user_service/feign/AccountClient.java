package com.example.user_service.feign;

import com.example.user_service.entity.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "account-service")
public interface AccountClient {

    @PostMapping("/api/accounts/saveAccount")
    Account createAccount(@RequestBody Account account);

    @GetMapping("/api/accounts/{userId}")
    List<Account> getAccountsByUserId(@PathVariable("userId") Integer userId);

    @GetMapping("/api/accounts")
    List<Account> getAllAccount();
}
