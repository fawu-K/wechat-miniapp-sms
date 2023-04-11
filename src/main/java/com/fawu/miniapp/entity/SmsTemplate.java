package com.fawu.miniapp.entity;

import com.kang.common.type.FieldType;
import com.kang.database.annotation.Field;
import com.kang.database.annotation.Table;
import com.kang.database.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 短信模板类
 * 在该模板类中存放短信的模板信息。他对应的参数会存放在{@link SmsTplParam}类中
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-11 13:39
 **/

@EqualsAndHashCode(callSuper = true)
@Data
@Table
public class SmsTemplate extends BaseEntity implements Serializable {

    /**
     * 模板id
     */
    @Field(fieldType = FieldType.BIGINT, length = 20, isNull = false, comment = "模板id")
    private Long tplId;

    /**
     * 模板信息
     */
    @Field(comment = "模板信息")
    private String tplMsg;

    /**
     * 模板描述
     */
    @Field(comment = "模板描述")
    private String tplDesc;
}
