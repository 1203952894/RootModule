package xyz.ccola.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Name: Result
 * @ Author: Cola
 * @ Time: 2022/12/13 20:54
 * @ Description: Result 结果集用于封装返回数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Object data;
    private Integer code;
    private String msg;
}
