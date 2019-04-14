package com.wenwen.design.pattern.Creational.singleton;

/**
 * Created by sww_6 on 2019/4/11.
 * 线程0看不到线程1的重排序。
 * * 原理：
 * jvm在累的初始化阶段，也就是class被加载后，也就是被线程使用之前，都是类的初始化阶段，在这个阶段会执行类的初始化。
 * 在执行类的初始化期间呢，jvm会获取一个锁，这个锁可以同步多个线程对一个雷的初始化，也就是绿色的部分，基于这个特性，
 * 我们可以实现基于静态内部类的、并且是线程安全的延迟初始化方案，
 *
 * A类会立刻被初始化的5种情况
 * 1、A类型的实例被创建。
 * 2、A类中声名的一个静态方法被调用。
 * 3、A类中声名的一个静态成员被赋值。
 * 4、A类中声名的一个静态成员被使用，并且静态成员不是一个常量成员。
 * 5、A类如果是一个顶级类，在类中嵌套的有断言语句，这种情况A类也会被立刻初始化。
 * 满足以上某一条件，就会立刻初始化。
 */
public class StaticInnerClassSingleton {

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
