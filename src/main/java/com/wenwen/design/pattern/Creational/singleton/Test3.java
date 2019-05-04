package com.wenwen.design.pattern.Creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by sww_6 on 2019/4/21.
 */
public class Test3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
        System.out.println(hungrySingleton);
        System.out.println(newInstance);
    }
}
