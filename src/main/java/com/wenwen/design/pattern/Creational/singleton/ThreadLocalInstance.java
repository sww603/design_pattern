package com.wenwen.design.pattern.Creational.singleton;

/**
 * Created by sww_6 on 2019/4/21.
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };
    private ThreadLocalInstance(){

    }
    public static ThreadLocalInstance getInstance(){
        return threadLocalInstance.get();
    }
}
