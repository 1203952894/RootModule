package xyz.ccola.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * @ Name: SpringConfig
 * @ Author: Cola
 * @ Time: 2022/12/5 15:14
 * @ Description: SpringConfig
 */
@Configuration
@ComponentScan("xyz.ccola")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
public class SpringConfig {
}
