package com.wenwen.design.pattern.Creational.singleton;

/**
 * Created by sww_6 on 2019/4/14.
 */
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton;
    static {
        hungrySingleton =new HungrySingleton();
    }
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
