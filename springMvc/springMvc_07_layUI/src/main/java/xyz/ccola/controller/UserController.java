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
 * @ Time: 2022/12/6 10:49
 * @ Description: UserController
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Cola");
        return "index";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Integer insertUser(User user) {
        return  userService.insertUser(user);
    }

    @RequestMapping("/modify")
    @ResponseBody
    public Integer modifyUser(User user,Integer mid) {
        return  userService.modifyUser(user,mid);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Integer deleteUser(Integer id) {
        return userService.deleteUser(id);
    }


    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAll() {
        return userService.getAll();
    }
}
