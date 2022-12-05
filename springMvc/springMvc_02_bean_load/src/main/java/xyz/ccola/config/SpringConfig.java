package xyz.ccola.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @ Name: SpringConfig
 * @ Author: Cola
 * @ Time: 2022/12/5 19:51
 * @ Description: SpringConfig
 */
@Configuration
@ComponentScan(value = "xyz.ccola",excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = Controller.class
))
@PropertySource({"classpath:jdbc.properties"})
@Import(value = {JDBCConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
