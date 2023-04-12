package com.fawu.miniapp.controller;

import com.fawu.miniapp.dto.SmsDto;
import com.fawu.miniapp.entity.Sms;
import com.fawu.miniapp.entity.SmsResult;
import com.fawu.miniapp.service.SmsService;
import com.fawu.miniapp.utils.JsonUtils;
import com.fawu.miniapp.vo.SmsTemplateVo;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 发送短信
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-04 09:14
 **/

@RestController
@RequestMapping("/wx/sms")
public class WxSmsController {

    @Resource
    private SmsService smsService;

    /**
     * 发送短信接口
     *
     * @param sms 短信信息
     * @return 短信成功与否
     */
    @PostMapping
    public ResponseEntity<?> sendSms(@RequestBody Sms sms) {
        String result = smsService.sendSms(sms);
        Gson gson = new Gson();
        SmsResult smsResult = gson.fromJson(result, SmsResult.class);
        if (smsResult.getCode() != 0){
            return ResponseEntity.status(500).body(smsResult);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("getTemplate")
    public ResponseEntity<?> getSmsTemplate() {
        List<SmsTemplateVo> list = smsService.getSmsTemplate();
        return ResponseEntity.ok(list);
    }

    @GetMapping("sendVerificationCode")
    public ResponseEntity<?> sendVerificationCode(@RequestParam String phone) {
        String s = smsService.sendVerificationCode(phone);
        return ResponseEntity.ok().build();
    }


}
