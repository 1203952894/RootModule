package xyz.ccola.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import xyz.ccola.exception.BusinessException;
import xyz.ccola.exception.SystemException;

/**
 * @ Name: ProjectExceptionAdvice
 * @ Author: Cola
 * @ Time: 2022/12/13 21:03
 * @ Description: ProjectExceptionAdvice
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    /**
     * 记录日志
     * @param ex 异常
     * @return 日志信息
     */
    @ExceptionHandler(SystemException.class)
    public xyz.ccola.controller.Result doSystemException(SystemException ex){

        return new xyz.ccola.controller.Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public xyz.ccola.controller.Result doBusinessException(BusinessException ex){
        return new xyz.ccola.controller.Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public xyz.ccola.controller.Result doOtherException(Exception ex){

        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙，请稍后再试！");
    }
}
