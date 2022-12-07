package xyz.ccola.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @ Name: SpringConfig
 * @ Author: Cola
 * @ Time: 2022/12/7 21:40
 * @ Description: SpringConfig
 */
@Configuration
@ComponentScan(value = "xyz.ccola",excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = Controller.class
))
@PropertySource({"classpath:jdbc.properties"})
@Import({JDBCConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
