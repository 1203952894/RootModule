package xyz.ccola.dao.impl;

import org.springframework.stereotype.Repository;
import xyz.ccola.dao.BookDao;

/**
 * @ Name: BookDaoImpl
 * @ Author: Cola
 * @ Time: 2022/12/5 10:46
 * @ Description: BookDaoImpl
 */
@Repository
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao Save");
    }
}
