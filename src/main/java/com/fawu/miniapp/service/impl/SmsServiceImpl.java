package com.fawu.miniapp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fawu.miniapp.config.YunPianSmsConfig;
import com.fawu.miniapp.dto.SmsDto;
import com.fawu.miniapp.entity.SmsTemplate;
import com.fawu.miniapp.entity.SmsTplParam;
import com.fawu.miniapp.mapper.SmsTemplateMapper;
import com.fawu.miniapp.mapper.SmsTplParamMapper;
import com.fawu.miniapp.service.SmsService;
import com.fawu.miniapp.utils.YunPianSmsApi;
import com.fawu.miniapp.vo.SmsTemplateVo;
import com.kang.common.util.WrapperUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 实现类
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-11 14:37
 **/

@Slf4j
@Service
public class SmsServiceImpl implements SmsService {

    @Resource
    private SmsTemplateMapper smsTemplateMapper;
    @Resource
    private SmsTplParamMapper smsTplParamMapper;

    @Override
    public String sendSms(SmsDto smsDto) {
        Long tplId = smsDto.getTplId();

        //拼接模板参数
        StringBuilder tplValue = new StringBuilder();
        for (Iterator<Map.Entry<String, String>> iterator = smsDto.getParams().entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, String> entry = iterator.next();
            tplValue.append("#").append(entry.getKey()).append("#=").append(entry.getValue());
            if (iterator.hasNext()){
                tplValue.append("&");
            }
        }
        String result = YunPianSmsApi.tplSendSms(YunPianSmsConfig.getApikey(), tplId, tplValue.toString(), smsDto.getPhone());
        log.debug("短信发送结果：{}", result);
        return result;
    }

    @Override
    public List<SmsTemplateVo> getSmsTemplate() {
        List<SmsTemplateVo> result = new ArrayList<>();
        List<SmsTemplate> smsTemplates = smsTemplateMapper.selectList(new QueryWrapper<>());

        smsTemplates.forEach(smsTemplate -> {
            SmsTemplateVo vo = new SmsTemplateVo();
            BeanUtils.copyProperties(smsTemplate, vo);

            QueryWrapper<SmsTplParam> wrapper = new QueryWrapper<>();
            wrapper.eq("tpl_id", smsTemplate.getTplId());
            List<SmsTplParam> params = smsTplParamMapper.selectList(wrapper);
            vo.setParams(params);
        });

        return result;
    }

    @Override
    public String sendVerificationCode(String phone) {
        // 随即6位数赋值验证码
        //String verificationCode = (int) ((Math.random() * 9 + 1) * 100000) + "";

        return "未完成该功能";
    }
}
