package com.wenwen.design.pattern.Creational.singleton;

/**
 * Created by sww_6 on 2019/4/11.
 * 原理：
 * jvm在累的初始化阶段，也就是class被加载后，也就是被线程使用之前，都是类的初始化阶段，在这个阶段会执行类的初始化。
 * 在执行类的初始化期间呢，jvm会获取一个锁，这个锁可以同步多个线程对一个雷的初始化，也就是绿色的部分，基于这个特性，
 * 我们可以实现基于静态内部类的、并且是线程安全的延迟初始化方案，
 */
public class StaticInnerClassSingleton {

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
