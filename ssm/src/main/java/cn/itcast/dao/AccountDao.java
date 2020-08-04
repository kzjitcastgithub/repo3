package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    //查询全部账号
    //@Select("select * from account")
    List<Account> findAll();

    //添加一条信息
    void insert(Account account);
}
