package com.wenwen.design.pattern.structurl.adapter.objectadapter;

import com.wenwen.design.pattern.structurl.adapter.classadapter.Target;

/**
 * Created by sww_6 on 2019/5/4.
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("concreteTarget目标方法!");
    }
}
