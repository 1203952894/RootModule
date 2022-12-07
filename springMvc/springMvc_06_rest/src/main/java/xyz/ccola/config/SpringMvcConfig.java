package xyz.ccola.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @ Name: SpringMvcConfig
 * @ Author: Cola
 * @ Time: 2022/12/7 21:39
 * @ Description: SpringMvcConfig
 */
@Configuration
@ComponentScan("xyz.ccola.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
