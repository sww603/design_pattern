package com.wenwen.design.pattern.Creational.singleton;

/**
 * Created by sww_6 on 2019/4/9.
 * 注意问题：
 * 1、在静态方法（static）上添加关键字（synchronized同步锁），就是相当于在类上加锁，锁的范围大，损耗性能。
 * 2、加锁、解锁过程消耗资源。
 */
public class LazySingleton {

  private static LazySingleton lazySingleton = null;

  private LazySingleton() {

  }
  public static LazySingleton getInstance() {
    if (lazySingleton == null) {
      lazySingleton = new LazySingleton();
    }
    return lazySingleton;
  }
}
