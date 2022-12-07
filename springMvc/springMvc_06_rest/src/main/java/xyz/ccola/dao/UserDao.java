package xyz.ccola.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import xyz.ccola.domain.User;

import java.util.List;

/**
 * @ Name: UserDao
 * @ Author: Cola
 * @ Time: 2022/12/7 21:57
 * @ Description: UserDao
 */
@Repository
public interface UserDao {

    /**
     * 获取全部用户
     * @return 用户列表
     */
    @Select("select * from table_user")
    List<User> getAll();
}
