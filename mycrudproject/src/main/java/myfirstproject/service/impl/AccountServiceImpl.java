package myfirstproject.service.impl;

import myfirstproject.entity.Account;
import myfirstproject.repository.AccountRepository;
import myfirstproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountServiceImpl implements AccountService {

   @Autowired
    AccountRepository accountRepository;



    @Override
    public List<Account> getAllAccount() {

        List<Account> accounts = (List<Account>) accountRepository.findAll();

        return accounts;
    }

    @Override
    public Account getByIdAccount(Long id) {

        Account account = accountRepository.findById(id).get();

        return account;
    }

    @Override
    public void create(Account account) {

       accountRepository.save(account);

    }

    @Override
    public void update(Account account,Long id) {

        Account oldaccount = accountRepository.findById(id).get();
        if(oldaccount.getId()==account.getId()) {

            oldaccount.setUserName(account.getUserName());
            oldaccount.setPassword(account.getPassword());
            oldaccount.setFirstName(account.getFirstName());
            oldaccount.setLastName(account.getLastName());
            oldaccount.setEmail(account.getEmail());

            accountRepository.save(account);

        }else {
         return;
        }

    }

    @Override
    public void delete(Long id) {

        accountRepository.deleteById(id);

    }
}
