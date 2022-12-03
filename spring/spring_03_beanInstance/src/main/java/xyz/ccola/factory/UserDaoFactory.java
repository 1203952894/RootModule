package xyz.ccola.factory;

import xyz.ccola.dao.UserDao;
import xyz.ccola.dao.impl.UserDaoImpl;

/**
 * @ Name: UserDaoFactory
 * @ Author: Cola
 * @ Time: 2022/12/3 12:50
 * @ Description: UserDaoFactory
 */
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
