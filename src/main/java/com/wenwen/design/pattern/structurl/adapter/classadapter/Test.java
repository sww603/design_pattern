package com.wenwen.design.pattern.structurl.adapter.classadapter;

/**
 * Created by sww_6 on 2019/5/4.
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
