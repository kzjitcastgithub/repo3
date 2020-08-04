package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/testFindAll")
    public String testFindAll(){
        System.out.println("业务层方法执行..");
        List<Account> accountList = accountService.findAll();
        for (Account account:accountList){
            System.out.println(account);
        }
        return "success";
    }

    @RequestMapping("/testInsert")
    public String testInsert(Account account){
        accountService.insert(account);
        System.out.println("业务层insert方法执行了..");
        return "success";
    }
}
