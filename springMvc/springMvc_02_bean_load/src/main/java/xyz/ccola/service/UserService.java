package xyz.ccola.service;

import xyz.ccola.domain.User;

import java.util.List;

/**
 * @ Name: UserService
 * @ Author: Cola
 * @ Time: 2022/12/5 19:56
 * @ Description: UserService
 */
public interface UserService {

    List<User> findAll();
}
