package xyz.ccola.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ Name: SpringMvcSupport
 * @ Author: Cola
 * @ Time: 2022/12/13 17:05
 * @ Description: SpringMvcSupport
 */
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("layui/**").addResourceLocations("/layui/");
        registry.addResourceHandler("layui/page/**").addResourceLocations("/layui/page/");
        registry.addResourceHandler("layui/css/**").addResourceLocations("/layui/css/");
        registry.addResourceHandler("layui/font/**").addResourceLocations("/layui/font/");
    }
}
