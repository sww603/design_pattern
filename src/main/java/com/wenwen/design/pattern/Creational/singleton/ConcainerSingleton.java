package com.wenwen.design.pattern.Creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sww_6 on 2019/4/20.
 * hashmap是线程不安全的，hashtable是线程安全的，但特别的影响性能。
 * 根据场景来选择。
 * 如果一个系统中单例对象非常多的情况下，那我们也可以考虑用一个容器把单例对象统一管理。
 * 优点：
 * 节省资源，统一管理，map相当于一个缓存。
 * 缺点：
 * 线程不安全。
 */
public class ConcainerSingleton {
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    private ConcainerSingleton() {

    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotEmpty(key) && instance == null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
