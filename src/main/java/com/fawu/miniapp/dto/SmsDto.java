package com.fawu.miniapp.dto;

import lombok.Data;

import java.util.Map;

/**
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-11 13:55
 **/

@Data
public class SmsDto {

    /**
     * 接收方
     */
    private String phone;

    /**
     * 短信类型
     */
    private Long tplId;

    /**
     * 短信参数
     */
    private Map<String, String> params;
}
