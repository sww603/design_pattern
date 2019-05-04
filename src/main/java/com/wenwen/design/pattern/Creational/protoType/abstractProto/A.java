package com.wenwen.design.pattern.Creational.protoType.abstractProto;

/**
 * Created by sww_6 on 2019/4/21.
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
