package xyz.ccola.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import xyz.ccola.dao.BookDao;
import xyz.ccola.service.BookService;

/**
 * @ Name: BookServiceImpl
 * @ Author: Cola
 * @ Time: 2022/12/5 10:46
 * @ Description: BookServiceImpl
 */
@Service
public class BookServiceImpl implements BookService {
    private  BookDao bookDao;

    public BookServiceImpl(@Qualifier(value = "bookDaoImpl2") BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("BookService Save");
        bookDao.save();
    }
}
