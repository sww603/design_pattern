package com.wenwen.design.pattern.structurl.adapter.classadapter;

/**
 * Created by sww_6 on 2019/5/4.
 */
public class Adapter extends Adaptee implements Target{
    public void request() {
        super.adapteeRequest();
    }
}
