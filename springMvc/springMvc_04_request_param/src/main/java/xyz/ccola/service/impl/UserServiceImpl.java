package xyz.ccola.service.impl;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ccola.dao.UserDao;
import xyz.ccola.domain.User;
import xyz.ccola.service.UserService;

import java.util.List;

/**
 * @ Name: UserServiceImpl
 * @ Author: Cola
 * @ Time: 2022/12/6 10:48
 * @ Description: UserServiceImpl
 */
@Service
@Data
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public Integer insertUser(User user){
        return userDao.insertUser(user);
    }

    @Override
    public Integer modifyUser(User user,Integer mid) {
        return userDao.modifyUser(user,mid);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userDao.deleteUser(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
