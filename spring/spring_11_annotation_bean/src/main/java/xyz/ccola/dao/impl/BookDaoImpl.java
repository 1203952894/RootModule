package xyz.ccola.dao.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.ccola.dao.BookDao;

/**
 * @ Name: BookDaoImpl
 * @ Author: Cola
 * @ Time: 2022/12/3 11:27
 * @ Description: BookDaoImpl
 */
@Component(value = "bookDao")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDaoImpl implements BookDao {
    private String name;
    @Override
    public void save() {
        System.out.println("BookDao save");
    }

    public void initMethod(){
        System.out.println("BookDao initMethod");
    }

    public void destroyMethod(){
        System.out.println("BookDao destroyMethod");
    }
}
