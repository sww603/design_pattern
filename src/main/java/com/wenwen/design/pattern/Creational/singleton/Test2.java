package com.wenwen.design.pattern.Creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by sww_6 on 2019/4/15.
 */
public class Test2 {

  public static void main(String[] args)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    //Class objectClass = HungrySingleton.class;
    Class objectClass = EnumInstance.class;
    Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
    constructor.setAccessible(true);
    EnumInstance wenwen = (EnumInstance) constructor.newInstance("wenwen", 666);
    HungrySingleton hungrySingleton = HungrySingleton.getInstance();
    HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//    System.out.println(hungrySingleton);
//    System.out.println(newInstance);
  }
}
