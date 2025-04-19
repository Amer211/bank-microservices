package com.example.user_service.dto;

import com.example.user_service.entity.Account;
import com.example.user_service.entity.User;

import java.util.List;

public class UserWithAccounts {
    private User user;
    private List<Account> accounts;

    public UserWithAccounts(User user, List<Account> accounts) {
        this.user = user;
        this.accounts = accounts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
