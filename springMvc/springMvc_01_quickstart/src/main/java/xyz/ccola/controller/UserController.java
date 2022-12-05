package xyz.ccola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Name: UserController
 * @ Author: Cola
 * @ Time: 2022/12/5 16:39
 * @ Description: UserController
 */

@Controller
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("User Save");
        return "{'info':'springmvc'}";
    }
}
