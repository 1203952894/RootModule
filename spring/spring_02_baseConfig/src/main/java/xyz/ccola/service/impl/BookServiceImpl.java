package xyz.ccola.service.impl;

import lombok.Data;
import xyz.ccola.dao.BookDao;
import xyz.ccola.service.BookService;

/**
 * @ Name: BookServiceImpl
 * @ Author: Cola
 * @ Time: 2022/12/3 11:27
 * @ Description: BookServiceImpl
 */
@Data
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("BookService save");
        bookDao.save();
    }
}
