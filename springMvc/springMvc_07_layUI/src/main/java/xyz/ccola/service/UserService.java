package xyz.ccola.service;

import xyz.ccola.domain.User;

import java.util.List;

/**
 * @ Name: UserService
 * @ Author: Cola
 * @ Time: 2022/12/6 10:48
 * @ Description: UserService
 */
public interface UserService {


    /**
     * 新增用户
     * @return 用户
     */
    Integer insertUser(User user);

    /**
     * 修改 用户
     * @return 用户
     */
    Integer modifyUser(User user,Integer mid);

    /**
     * 删除用户
     * @return 用户
     */
    Integer deleteUser(Integer id);

    /**
     * 获取全部用户
     * @return 用户列表
     */
    List<User> getAll();
}
