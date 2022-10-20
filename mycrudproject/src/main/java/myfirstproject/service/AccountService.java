package myfirstproject.service;

import myfirstproject.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface AccountService {

    List<Account> getAllAccount();
    Account getByIdAccount(Long id);

    void create(Account account);
    void update(Account account,Long id);
    void delete(Long id);


}
