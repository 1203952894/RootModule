package xyz.ccola.factory;

import org.jetbrains.annotations.NotNull;
import xyz.ccola.dao.OrderDao;
import xyz.ccola.dao.impl.OrderDaoImpl;

/**
 * @ Name: OrderDaoFactory
 * @ Author: Cola
 * @ Time: 2022/12/3 12:37
 * @ Description: OrderDaoFactory 静态工厂
 */
public class OrderDaoFactory {


    public static @NotNull OrderDao orderDaoFactory(){
        System.out.println("orderDao factory");
        return new OrderDaoImpl();
    }
}
