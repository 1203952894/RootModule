package xyz.ccola.factory;

import org.springframework.beans.factory.FactoryBean;
import xyz.ccola.dao.UserDao;
import xyz.ccola.dao.impl.UserDaoImpl;

/**
 * @ Name: UserDaoFactoryBean
 * @ Author: Cola
 * @ Time: 2022/12/3 13:01
 * @ Description: UserDaoFactoryBean
 */
public class UserDaoFactoryBean implements FactoryBean {
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    @Override
    public Object getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
