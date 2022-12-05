package xyz.ccola.service;

import xyz.ccola.pojo.User;

import java.util.List;

/**
 * @ Name: UserService
 * @ Author: Cola
 * @ Time: 2022/12/5 11:44
 * @ Description: UserService
 */
public interface UserService {

    List<User> findAll();
}
