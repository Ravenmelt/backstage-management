package com.example.backstage_management;

import com.example.backstage_management.controller.ManagementController;
import com.example.backstage_management.domain.Account;
import com.example.backstage_management.domain.Item;
import com.example.backstage_management.service.AccountService;
import com.example.backstage_management.service.ItemService;
import com.example.backstage_management.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import java.util.List;

@SpringBootTest
class BackstageManagementApplicationTests {
    @Autowired
    AccountService accountService;

    @Autowired
    ItemService itemService;

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads() {

        List<Account> accountList=accountService.getAccountList();
    }

    @Test
    void viewAccount(){
        Account account=accountService.getAccount("ACID");
        System.out.println("xxxx"+account.getFirstName());
    }

    @Test
    void testItemList(){
        List<Item> itemList = itemService.getItemList();
        System.out.println(itemList.get(0).getProductId());
    }

    @Test
    void testOrder(){
        orderService.getOrder("1000");
    }
}
