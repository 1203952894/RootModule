package xyz.ccola.dao.impl;

import xyz.ccola.dao.BookDao;

/**
 * @ Name: BookDaoImpl
 * @ Author: Cola
 * @ Time: 2022/12/3 11:27
 * @ Description: BookDaoImpl
 */
public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("BookDaoImpl 无参构造函数被调用");
    }

    @Override
    public void save() {
        System.out.println("BookDao save");
    }
}
