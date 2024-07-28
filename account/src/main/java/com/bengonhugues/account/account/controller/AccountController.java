package com.bengonhugues.account.account.controller;


import com.bengonhugues.account.account.HttpStatuts;
import com.bengonhugues.account.account.model.Account;
import com.bengonhugues.account.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;

    }

    @PostMapping("/create")
    public String creatAccountService(@RequestBody Account account) {
         accountService.createAccount(account);
        return (HttpStatuts.MESSAGE_201);
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);

    }
    @GetMapping("/all")
    public List<Account> getAll(){
        return accountService.getAllAccount();
    }
}



