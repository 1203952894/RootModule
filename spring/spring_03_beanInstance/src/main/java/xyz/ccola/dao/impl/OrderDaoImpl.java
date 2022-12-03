package xyz.ccola.dao.impl;

import xyz.ccola.dao.OrderDao;

/**
 * @ Name: OrderDaoImpl
 * @ Author: Cola
 * @ Time: 2022/12/3 12:36
 * @ Description: OrderDaoImpl
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("OrderDao save");
    }
}
