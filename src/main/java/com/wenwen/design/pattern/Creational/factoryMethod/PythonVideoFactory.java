package com.wenwen.design.pattern.Creational.factoryMethod;

/**
 * Created by sww_6 on 2019/4/6.
 */
public class PythonVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new PythonView();
    }
}
