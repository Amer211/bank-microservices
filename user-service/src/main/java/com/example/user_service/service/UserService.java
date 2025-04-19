package com.example.user_service.service;

import com.example.user_service.dto.UserWithAccounts;
import com.example.user_service.entity.Account;
import com.example.user_service.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getAllUsers();


    List<Account> getAccountsByUserId(Integer userId);

    List<Account> getAllAccounts();
}
