package com.fawu.miniapp.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * 云片短信配置
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-03 16:03
 **/

public class YunPianSmsConfig {
    /**
     * 设置云片的短信appid
     */
    private static String appid;

    public static String getAppid() {
        return appid;
    }

    @Value("${yun.appid}")
    private static void setAppid(String appid) {
        YunPianSmsConfig.appid = appid;
    }
}
