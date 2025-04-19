package com.example.user_service.controller;

import com.example.user_service.dto.UserWithAccounts;
import com.example.user_service.entity.Account;
import com.example.user_service.entity.User;
import com.example.user_service.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody User user){

        userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public List<Account> getAccountsByUserId(@PathVariable Integer userId){
        return userService.getAccountsByUserId(userId);
    }
    @GetMapping("/allAccounts")
    public List<Account> getAllAccounts(){
        return userService.getAllAccounts();
    }


}
