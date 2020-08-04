package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        List<Account> accountList = accountDao.findAll();
        System.out.println("服务层findAll方法执行了..");
        return accountList;
    }

    @Override
    @Transactional
    public void insert(Account account) {
        accountDao.insert(account);
        //int a = 1/0;
        System.out.println("服务层insert方法执行了..");
    }
}
