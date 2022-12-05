package xyz.ccola.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @ Name: ServletContainersInitConfig
 * @ Author: Cola
 * @ Time: 2022/12/5 16:40
 * @ Description: ServletContainersInitConfig
 */
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMVCConfig.class);
        return ctx;
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

}
