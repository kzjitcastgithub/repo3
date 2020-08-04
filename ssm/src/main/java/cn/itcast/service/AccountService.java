package cn.itcast.service;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {

    //查询全部账号
    List<Account> findAll();

    //添加一条信息
    void insert(Account account);
}
