package com.wenwen.design.pattern.structurl.adapter;

/**
 * Created by sww_6 on 2019/5/4.
 */
public class PowerAdappter implements DC5 {
    private AC220 ac220 = new AC220();
    public int output5v() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用powerAdappter输出AC:"+adapterInput+"v"+"输出DC"+adapterOutput+"v");
        return adapterOutput;
    }
}
