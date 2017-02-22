package com.fx.supplier.base;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by H on 2017/2/19.
 */
public abstract class BaseQuery {
    /**
     * 把页面上表单里的元素封装到Map
     */
    private Map<String, Object> keyValues = new HashMap<String, Object>();
    public Map<String, Object> getKeyValues() {
        return keyValues;
    }

    public void setKeyValues(Map<String, Object> keyValues) {
        this.keyValues = keyValues;
    }

    /**
     * 把页面的查询条件封装并返回
     *
     * @return
     */
    public abstract Map<String, Object> buildWhere();
}
