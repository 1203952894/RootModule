package xyz.ccola.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ Name: User
 * @ Author: Cola
 * @ Time: 2022/12/5 10:55
 * @ Description: User
 */
@Component(value = "user01")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Value("1")
    private Integer id;
    @Value("Cola")
    private String name;
    @Value("${jdbc.url}")
    private String ownURL;
}
