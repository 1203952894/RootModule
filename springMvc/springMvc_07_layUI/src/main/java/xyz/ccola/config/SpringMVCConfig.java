package xyz.ccola.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @ Name: SpringMVCConfig
 * @ Author: Cola
 * @ Time: 2022/12/6 10:30
 * @ Description: SpringMVCConfig
 */
@Configuration
@ComponentScan("xyz.ccola")
@EnableWebMvc
public class SpringMVCConfig {
}
