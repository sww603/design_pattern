package com.wenwen.design.pattern.Creational.protoType.clone;

import java.util.Date;

/**
 * Created by sww_6 on 2019/4/21.
 * 引用对象是否需要深克隆，原型模式是由坑的。
 */
public class Pig implements Cloneable {
    public String name;
    public Date birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        //深克隆,引用对象也要单独克隆。
        pig.birthDay = (Date) pig.getBirthDay().clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", date=" + birthDay +
                '}' + super.toString();
    }

    public Pig(String name, Date date) {
        this.name = name;
        this.birthDay = date;
    }
}
