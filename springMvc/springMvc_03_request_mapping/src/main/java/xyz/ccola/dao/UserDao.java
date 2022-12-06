package xyz.ccola.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import xyz.ccola.domain.User;

import java.util.List;

/**
 * @ Name: UserDao
 * @ Author: Cola
 * @ Time: 2022/12/6 10:46
 * @ Description: UserDao
 */
@Repository
public interface UserDao {

    /**
     * 新增用户
     * @return 用户
     */
    @Insert("INSERT INTO table_user (id, username, age, vip_id) " +
            "VALUES (#{id},#{username},#{age},#{vip_id})")
    Integer insertUser(User user);

    /**
     * 修改 用户
     * @return 用户
     */
    @Update("UPDATE table_user SET" +
            " id=#{user.id},username=#{user.username},age=#{user.age},vip_id=#{user.vip_id} where id=#{mid}")
    Integer modifyUser(@Param("user") User user,@Param("mid") Integer mid);

    /**
     * 删除用户
     * @return 用户
     */
    @Delete("DELETE from table_user where id=#{id}")
    Integer deleteUser(Integer id);

    /**
     * 获取全部用户
     * @return 用户列表
     */
    @Select("SELECT * from table_user")
    List<User> getAll();
}
