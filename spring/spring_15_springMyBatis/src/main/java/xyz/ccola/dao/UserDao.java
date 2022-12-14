package xyz.ccola.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import xyz.ccola.pojo.User;

import java.util.List;

/**
 * @ Name: UserDao
 * @ Author: Cola
 * @ Time: 2022/12/5 11:43
 * @ Description: UserDao
 */
@Repository
public interface UserDao {

    @Select("select * from table_user")
    List<User> findAll();
}
