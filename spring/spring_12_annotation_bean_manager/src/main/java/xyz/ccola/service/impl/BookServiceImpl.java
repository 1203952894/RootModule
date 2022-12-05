package xyz.ccola.service.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ccola.dao.BookDao;
import xyz.ccola.service.BookService;

/**
 * @ Name: BookServiceImpl
 * @ Author: Cola
 * @ Time: 2022/12/5 9:27
 * @ Description: BookServiceImpl
 */
@Service
@Data
@NoArgsConstructor
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("BookService Save");
        bookDao.save();
    }
}
