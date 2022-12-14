package xyz.ccola.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Name: User
 * @ Author: Cola
 * @ Time: 2022/12/13 20:57
 * @ Description: User
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("table_user")
public class User {
    private Integer id;
    private String username;
    private Integer age;
    @TableField("vip_id")
    private Integer vipId;
}
