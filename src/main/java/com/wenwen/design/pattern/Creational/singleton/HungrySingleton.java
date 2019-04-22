package com.wenwen.design.pattern.Creational.singleton;

import java.io.Serializable;

/**
 * Created by sww_6 on 2019/4/14.
 * 问题猜想，假如将一个对象通过序列化放到一个文件后，再取出来看是否与本身相等？
 * instance和newInstance不相等，就违背了单例模式的一个初衷，通过序列化和反序列化拿到了不同的对象。而我们是希望拿到一个对象。
 * 解决原理：
 *
 */
public class HungrySingleton implements Serializable {

  private final static HungrySingleton hungrySingleton;

  static {
    hungrySingleton = new HungrySingleton();
  }

  private HungrySingleton() {

  }
  public static HungrySingleton getInstance() {
    return hungrySingleton;
  }
  private Object readResolve() {
    return hungrySingleton;
  }
}
