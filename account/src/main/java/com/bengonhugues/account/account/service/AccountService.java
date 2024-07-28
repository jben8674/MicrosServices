package com.bengonhugues.account.account.service;


import com.bengonhugues.account.account.model.Account;
import com.bengonhugues.account.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
   private final AccountRepository accountRepository;


    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public Optional<Account> getAccount(Long id){

        return accountRepository.findById(id);
    }
    public List<Account> getAllAccount(){

        return accountRepository.findAll();
    }
}

