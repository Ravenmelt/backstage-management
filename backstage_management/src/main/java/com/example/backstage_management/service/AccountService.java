package com.example.backstage_management.service;

import com.example.backstage_management.domain.Account;
import com.example.backstage_management.persistence.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public List<Account> getAccountList(){
        return accountMapper.getAllAccounts();
    }

    public void updateAccount(Account account){
        accountMapper.updateAccount(account);
    }

    public void resetPassword(Account account){
        accountMapper.resetPassword(account);
    }

    public Account getAccount(String username) {return accountMapper.getAccount(username);}
}
