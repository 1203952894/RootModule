package xyz.ccola.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.ccola.domain.User;

import java.util.Date;
import java.util.List;

/**
 * @ Name: ParamController
 * @ Author: Cola
 * @ Time: 2022/12/7 20:18
 * @ Description: ParamController
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(@RequestParam("name") String userName, Integer id){
        System.out.println("普通参数传递："+userName);
        System.out.println("普通参数传递："+id);
        return "{'module':'commonParam'}";
    }

    @RequestMapping("/concreteParamURL")
    @ResponseBody
    public String concreteParamURL(User user){
        System.out.println(user);
        return "{'module':'concreteParam'}";
    }

    @RequestMapping("/concreteParamJson")
    @ResponseBody
    public String concreteParamJSON(@RequestBody User user){
        System.out.println(user);
        return "{'module':'concreteParam'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String [] likes){
        for (String like : likes) {
            System.out.println(like);
        }
        return "{'module':'arrayParam'}";
    }

    @RequestMapping("/setParam")
    @ResponseBody
    public String setParam(@RequestParam List<String> hobbies){
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        return "{'module':'setParam'}";
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date1,
                            @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date2){
        System.out.println(date1);
        System.out.println(date2);
        return "{'module':'dateParam'}";
    }



}
