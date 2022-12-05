package xyz.ccola.dao.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;
import xyz.ccola.dao.BookDao;

/**
 * @ Name: BookDaoImpl
 * @ Author: Cola
 * @ Time: 2022/12/5 15:13
 * @ Description: BookDaoImpl
 */
@Repository
@Data
@AllArgsConstructor
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            System.out.println("BookDao Save");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("执行百次所消耗的时间 "+(endTime-startTime)+" ms");
    }

    @Override
    public void update() {
        System.out.println("BookDao Update");
    }
}
