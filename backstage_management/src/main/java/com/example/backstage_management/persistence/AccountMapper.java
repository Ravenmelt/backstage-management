package com.example.backstage_management.persistence;

import com.example.backstage_management.domain.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {

    List<Account> getAllAccounts();

    void updateAccount(Account account);

    void resetPassword(Account account);

    Account getAccount(@Param("value")String name);
}
