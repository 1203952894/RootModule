package xyz.ccola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.ccola.dao.UserDao;
import xyz.ccola.domain.User;

import java.util.List;

/**
 * @ Name: UserController
 * @ Author: Cola
 * @ Time: 2022/12/13 20:56
 * @ Description: UserController 控制层
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping
    @ResponseBody
    public Result getAll() {
        List<User> userList = userDao.selectList(null);
        Integer code = userList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = userList != null ? "" : "数据查询失败，请重试！";
        return new Result(userList,code,msg);
    }


}
