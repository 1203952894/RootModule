package xyz.ccola.service.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ccola.dao.BookDao;
import xyz.ccola.service.BookService;

/**
 * @ Name: BookServiceImpl
 * @ Author: Cola
 * @ Time: 2022/12/3 11:27
 * @ Description: BookServiceImpl
 */
@Service
@Data
@NoArgsConstructor
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    private BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("BookService save");
        bookDao.save();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BookService initMethod");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BookService destroyMethod");
    }
}
