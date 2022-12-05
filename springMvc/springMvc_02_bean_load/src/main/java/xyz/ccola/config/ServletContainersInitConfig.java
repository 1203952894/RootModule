package xyz.ccola.config;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @ Name: ServletContainersInitConfig
 * @ Author: Cola
 * @ Time: 2022/12/5 19:47
 * @ Description: ServletContainersInitConfig
 */
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    @Override
    protected @NotNull WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMVCConfig.class);
        return ctx;
    }

    @Override
    protected String @NotNull [] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringConfig.class);
        return ctx;
    }
}
