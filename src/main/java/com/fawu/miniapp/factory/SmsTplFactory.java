package com.fawu.miniapp.factory;

import com.kang.common.type.Type;
import com.kang.common.vo.ITableVo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取短信模板类的工厂
 *
 * @author <a href="https://github.com/fawu-K">fawu.K</a>
 * @since 2023-04-11 14:00
 **/

public class SmsTplFactory {

    private static final List<Class<? extends ITableVo>> TABLE_VO_LIST = new ArrayList<>();
    private static final Map<Type, List<Class<? extends ITableVo>>> TABLE_VO_MAPS = new HashMap<>();
}
