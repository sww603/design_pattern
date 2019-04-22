package com.wenwen.design.pattern.Creational.singleton;

/**
 * Created by sww_6 on 2019/4/18.
 * 通过readString这个方法，获取到枚举对象的名称name
 * en声明为null,在这一行赋值。
 * 再通过类型，和name来获得枚举常量，因为枚举中的name为唯一的，并且对应一个枚举常量，所以1741行拿到的是唯一的枚举常量对象。
 * 这样就没有创建新的枚举对象，维持了这个对象的单例属性，所以枚举类对序列化这种破坏是不受影响的。
 * 枚举类对序列化不受影响，满反射攻击呢？
 * 没有获得无参构造器
 * 底层ENUM(),只有一个构造器，而且不是无参的。
 * 非法的参数异常，
 * 枚举类是非常强大的，序列化相关的，还有反射相关的，都是别的类来处理的，ObjectOutputStream和Constructor他们俩来处理枚举类的逻辑，那
 * 枚举类本身有什么优势呢？
 */
public enum EnumInstance {

  WENWEN;
  private Object data;

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public static EnumInstance getInstance() {
    return WENWEN;
  }
}
