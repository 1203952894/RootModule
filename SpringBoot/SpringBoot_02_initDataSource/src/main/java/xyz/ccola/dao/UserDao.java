package xyz.ccola.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.ccola.domain.User;

/**
 * @ Name: UserDao
 * @ Author: Cola
 * @ Time: 2022/12/13 19:32
 * @ Description: UserDao
 */
@Mapper
@TableName("table_user")
public interface UserDao extends BaseMapper<User> {
}
