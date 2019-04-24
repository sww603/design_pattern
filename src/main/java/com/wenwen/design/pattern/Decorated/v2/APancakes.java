package com.wenwen.design.pattern.Decorated.v2;

/**
 * Created by sww_6 on 2019/4/22.
 * 1、接口可以多继承，抽象类只能单继承
 * 2、抽象类继承接口，可以不用实现接口的方法。
 * 3、类必须实现抽象类的抽象方法和抽象变量。
 * 4、抽象方法必须为public或者protected（因为如果为private，则不能被子类继承，子类便无法实现该方法），缺省情况下默认为public。
 * 5、抽象类不能用来创建对象。
 */
public abstract class APancakes {

  public abstract String getDesc();

  public abstract int cost();
}
