package com.wenwen.design.pattern.structurl.adapter.objectadapter;

/**
 * Created by sww_6 on 2019/5/4.
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    public void request() {
        adaptee.adapteeRequest();
    }
}
