package com.wenwen.design.pattern.Creational.protoType.clone;

import com.wenwen.design.pattern.Creational.singleton.HungrySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by sww_6 on 2019/4/21.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*Date date = new Date(0L);
        Pig pig1 = new Pig("小猪佩奇", date);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthDay().setTime(666666666666666L);
        System.out.println(pig1);
        System.out.println(pig2);*/
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        //HungrySingleton instanceClone = (HungrySingleton) method.invoke(instance);
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }
}
