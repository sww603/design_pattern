package com.wenwen.design.pattern.Creational.singleton;

/**
 * Created by sww_6 on 2019/4/9.
 */
public class T implements Runnable{

  public void run() {

    //LazySingleton instance = LazySingleton.getInstance();
    ConcainerSingleton.putInstance("object",new Object());
    Object object = ConcainerSingleton.getInstance("object");
    System.out.println(Thread.currentThread().getName()+" "+object);
  }
}
