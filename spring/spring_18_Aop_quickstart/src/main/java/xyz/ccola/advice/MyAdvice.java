package xyz.ccola.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ Name: MyAdvice
 * @ Author: Cola
 * @ Time: 2022/12/5 15:27
 * @ Description: MyAdvice
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void xyz.ccola.dao.impl.BookDaoImpl.update())")
    private void pt() {
    }

    @Before("pt()")
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @After("pt()")
    public void AfterMethod() {
        System.out.println("AfterMethod");
    }


    @AfterReturning("pt()")
    public void AfterReturningMethod() {
        System.out.println("AfterReturningMethod");
    }

    @AfterThrowing("pt()")
    public void AfterThrowingMethod() {
        System.out.println("AfterThrowingMethod");
    }
}
