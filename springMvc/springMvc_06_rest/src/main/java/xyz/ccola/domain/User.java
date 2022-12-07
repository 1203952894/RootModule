package xyz.ccola.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Name: User
 * @ Author: Cola
 * @ Time: 2022/12/7 21:56
 * @ Description: User
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private Integer vip_id;
}
