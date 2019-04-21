package com.wenwen.design.pattern.Creational.singleton;

/**
 * Created by sww_6 on 2019/4/15.
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
