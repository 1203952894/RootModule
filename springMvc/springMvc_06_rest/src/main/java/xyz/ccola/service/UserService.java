package xyz.ccola.service;

import xyz.ccola.domain.User;

import java.util.List;

/**
 * @ Name: UserService
 * @ Author: Cola
 * @ Time: 2022/12/7 21:57
 * @ Description: UserService
 */
public interface UserService {

    /**
     * 获取全部用户
     * @return 用户列表
     */
    List<User> getAll();
}
