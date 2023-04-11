package com.fawu.miniapp.vo;

import com.fawu.miniapp.entity.SmsTplParam;
import lombok.Data;

import java.util.List;

/**
 * 短信模板视图类
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-11 14:47
 **/

@Data
public class SmsTemplateVo {

    /**
     * 模板id
     */
    private Long tplId;

    /**
     * 模板信息
     */
    private String tplMsg;

    /**
     * 模板描述
     */
    private String tplDesc;

    private List<SmsTplParam> params;

}
