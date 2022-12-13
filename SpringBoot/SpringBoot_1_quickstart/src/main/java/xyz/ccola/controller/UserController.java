package xyz.ccola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Name: UserController
 * @ Author: Cola
 * @ Time: 2022/12/13 18:53
 * @ Description: UserController
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        System.out.println("Hello SpringBoot");
        return "Hello SpringBoot";
    }

}
