package myfirstproject.controller;

import myfirstproject.entity.Account;
import myfirstproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")

public class AccountController {

    @Autowired
    AccountService accountService;


    @GetMapping("/getList")
    public List<Account> getAllAccount(){

       List<Account> accounts = accountService.getAllAccount();

       return accounts;
    }


    @GetMapping("/getAccount/{id}")
    public Account getByIdAccount(@PathVariable Long id){

        Account account = accountService.getByIdAccount(id);

        return account;
    }


    @PostMapping("/createAccount")
    public void create(@RequestBody Account account){

        accountService.create(account);

    }


    @PutMapping("/updateAccount/{id}")
    public void update(@RequestBody Account account,@PathVariable Long id){

        accountService.update(account,id);

    }

    @DeleteMapping("/deleteAccount/{id}")
    public void delete(@PathVariable Long id){

        accountService.delete(id);

    }

}
