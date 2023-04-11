package com.fawu.miniapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 云片短信配置
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-03 16:03
 **/

@Component
public class YunPianSmsConfig {
    /**
     * 设置云片的短信appid
     */
    private static String APIKEY;

    public static String getApikey() {
        return APIKEY;
    }

    @Value("${yun.apikey}")
    private void setApikey(String apikey) {
        APIKEY = apikey;
    }
}
