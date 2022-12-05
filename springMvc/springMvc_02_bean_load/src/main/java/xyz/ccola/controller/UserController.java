package xyz.ccola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.ccola.domain.User;
import xyz.ccola.service.UserService;

import java.util.List;

/**
 * @ Name: UserController
 * @ Author: Cola
 * @ Time: 2022/12/5 19:59
 * @ Description: UserController
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        List<User> userList = userService.findAll();
        return "{'module':'commonParam'}";
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll() {
        List<User> userList = userService.findAll();
        return userList;
    }
}
