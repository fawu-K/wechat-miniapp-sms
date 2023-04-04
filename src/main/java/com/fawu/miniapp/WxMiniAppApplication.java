package com.fawu.miniapp;

import com.kang.EnableAutoDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注解@EnableAutoDB(entityToTable = false, tableToEntity = true)
 * 不开启实体类生成数据表，开启数据表生成实体类功能
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 */
@EnableAutoDB(entityToTable = false, tableToEntity = true)
@SpringBootApplication
public class WxMiniAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(WxMiniAppApplication.class, args);
    }
}
