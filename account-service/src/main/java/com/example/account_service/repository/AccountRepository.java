package com.example.account_service.repository;

import com.example.account_service.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
    //List<Account> findAccountByUserId(Integer userId);
}
