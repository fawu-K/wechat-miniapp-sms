package com.fawu.miniapp.service;

import com.fawu.miniapp.dto.SmsDto;
import com.fawu.miniapp.entity.Sms;
import com.fawu.miniapp.vo.SmsTemplateVo;

import java.util.List;

/**
 * 短信发送服务类
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-11 14:36
 **/

public interface SmsService {

    /**
     * 短信发送方法
     * 在该方法中会根据dto类的中的参数信息进行模板参数组装，以达到不同模板使用同一个方法
     * @param sms 短信发送方法
     * @return 短信发送结果
     */
    String sendSms(Sms sms);

    /**
     * 获取短信模板信息
     * @return 短信模板信息
     */
    List<SmsTemplateVo> getSmsTemplate();

    /**
     * 发送验证码短信
     * @param phone
     * @return
     */
    String sendVerificationCode(String phone);
}
