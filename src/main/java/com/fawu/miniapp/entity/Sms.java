package com.fawu.miniapp.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 短信类
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-11 09:21
 **/

@Data
public class Sms implements Serializable {

    /**
     * 接收短信的手机号
     */
    private String phone;

    /**
     * 自定义短信内容
     */
    private String message;

    /**
     * 发送类型
     */
    private Long sendType;
}
