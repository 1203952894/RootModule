package xyz.ccola.dao.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import xyz.ccola.dao.BookDao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ Name: BookDaoImpl
 * @ Author: Cola
 * @ Time: 2022/12/5 9:26
 * @ Description: BookDaoImpl
 */
@Repository
@Data
@NoArgsConstructor
@Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao Save");
    }

    @PostConstruct //在构造方法之后执行，替换 init-method
    public void init() {
        System.out.println("init ...");
    }
    @PreDestroy //在销毁方法之前执行,替换 destroy-method
    public void destroy() {
        System.out.println("destroy ...");
    }
}
