package com.wenwen.design.pattern.Creational.singleton;

/**
 * Created by sww_6 on 2019/4/9.
 */
public class Test {

  public static void main(String[] args) {
    //LazySingleton instance = LazySingleton.getInstance();
    Thread t1 = new Thread(new T());
    Thread t2 = new Thread(new T());
    t1.start();
    t2.start();
    System.out.println("this is end");
  }
}
