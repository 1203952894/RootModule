package xyz.ccola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyz.ccola.domain.User;
import xyz.ccola.service.UserService;

import java.util.List;

/**
 * @ Name: UserController
 * @ Author: Cola
 * @ Time: 2022/12/7 22:00
 * @ Description: UserController
 */
@Controller
@RequestMapping("/users")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String insertUser(@RequestBody User user){
        System.out.println(user);
        return "insertUser";
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    String getUserById(@PathVariable("id") Integer id){
        System.out.println(id);
        return "getUserById";
    }

    @DeleteMapping("/{id}")
    String deleteUserById(@PathVariable("id") Integer id){
        System.out.println(id);
        return "deleteUserById";
    }

   @PutMapping
    String updateUserById(@RequestBody User user){
        System.out.println(user);
        return "updateUserById";
    }

}
