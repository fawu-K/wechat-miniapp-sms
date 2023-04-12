package com.fawu.miniapp.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 调用短信接口返回的结果
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-11 18:02
 **/

@Data
public class SmsResult implements Serializable {

    private Integer code;

    private String msg;

    private Integer count;

    private BigDecimal fee;

    private String unit;

    private String mobile;

    private Long sid;
}
