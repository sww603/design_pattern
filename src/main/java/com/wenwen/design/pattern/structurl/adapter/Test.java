package com.wenwen.design.pattern.structurl.adapter;

/**
 * Created by sww_6 on 2019/5/4.
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdappter();
        dc5.output5v();
    }
}
