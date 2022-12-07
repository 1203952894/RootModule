package xyz.ccola.config;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @ Name: ServletContainersInitConfig
 * @ Author: Cola
 * @ Time: 2022/12/6 10:40
 * @ Description: ServletContainersInitConfig
 */
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }

    @Override
    protected String @NotNull [] getServletMappings() {
        return new String[]{"/"};
    }
}
