package xyz.ccola.exception;

/**
 * @ Name: SystemException
 * @ Author: Cola
 * @ Time: 2022/12/13 21:01
 * @ Description: SystemException
 */
public class SystemException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
