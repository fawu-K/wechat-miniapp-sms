package com.fawu.miniapp.entity;

import com.kang.common.type.FieldType;
import com.kang.database.annotation.Field;
import com.kang.database.annotation.Table;
import com.kang.database.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 模板参数类
 * 不同的模板需要发送不同的参数
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-11 13:43
 **/

@EqualsAndHashCode(callSuper = true)
@Data
@Table
public class SmsTplParam extends BaseEntity implements Serializable {

    /**
     * 模板id
     */
    @Field(fieldType = FieldType.BIGINT, length = 20, isNull = false, comment = "模板id")
    private Long tplId;

    /**
     * 参数名
     */
    @Field(length = 50, isNull = false, comment = "参数名")
    private String paramName;

    /**
     * 参数描述
     */
    @Field(comment = "参数描述")
    private String paramDesc;
}
