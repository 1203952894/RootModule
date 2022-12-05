package xyz.ccola.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @ Name: SpringConfig
 * @ Author: Cola
 * @ Time: 2022/12/5 11:07
 * @ Description: SpringConfig
 */
@Configuration
@ComponentScan(value = {"xyz.ccola"})
@PropertySource({"classpath:jdbc.properties"})
@Import(value = {UserConfig.class})
public class SpringConfig {

}
