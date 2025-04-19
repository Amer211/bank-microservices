package com.example.user_service.service;

import com.example.user_service.dto.UserWithAccounts;
import com.example.user_service.entity.Account;
import com.example.user_service.entity.User;
import com.example.user_service.feign.AccountClient;
import com.example.user_service.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final Logger logger = LogManager.getLogger(UserServiceImpl.class);
    private final AccountClient accountClient;

    public UserServiceImpl(UserRepository userRepository, AccountClient accountClient) {
        this.userRepository = userRepository;
        this.accountClient = accountClient;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
        logger.info("{} was saved.", user.getUsername());
        //trigger account class :
        Account account =new Account();
        account.setUserId(user.getUserId());
        Account createdAccount = accountClient.createAccount(account);
        logger.info("Account Number: {} was created.", createdAccount.getAccountNumber());
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public List<Account> getAccountsByUserId(Integer userId) {
        return accountClient.getAccountsByUserId(userId);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountClient.getAllAccount();
    }


}
