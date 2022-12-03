package xyz.ccola.dao.impl;

import xyz.ccola.dao.UserDao;

/**
 * @ Name: UserDaoImpl
 * @ Author: Cola
 * @ Time: 2022/12/3 12:47
 * @ Description: UserDaoImpl
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao save");
    }
}
