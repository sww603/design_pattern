package com.wenwen.design.pattern.Creational.protoType;

/**
 * Created by sww_6 on 2019/4/21.
 * 实现克隆功能只需要：
 * 1、继承克隆接口。
 * 2、重写克隆方法。
 */
public class Mail implements Cloneable {

    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail class Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object!");
        return super.clone();
    }

}
