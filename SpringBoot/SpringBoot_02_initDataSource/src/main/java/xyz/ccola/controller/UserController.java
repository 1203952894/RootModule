package xyz.ccola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.ccola.dao.UserDao;
import xyz.ccola.domain.User;

import java.util.List;

/**
 * @ Name: UserController
 * @ Author: Cola
 * @ Time: 2022/12/13 18:53
 * @ Description: UserController
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        System.out.println("Hello SpringBoot");
        return "Hello SpringBoot";
    }

    @GetMapping
    @ResponseBody
    public List<User> getAll(){
        List<User> userList = userDao.selectList(null);
        return userList;
    }
}
