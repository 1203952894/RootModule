package xyz.ccola.dao.impl;

import xyz.ccola.dao.BookDao;

/**
 * @ Name: BookDaoImpl
 * @ Author: Cola
 * @ Time: 2022/12/3 11:27
 * @ Description: BookDaoImpl
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao save");
    }
}
