package com.wenwen.design.pattern.Creational.protoType;

/**
 * Created by sww_6 on 2019/4/21.
 * 每一次循环都要new一次对象，很消耗性能，那么如何解决呢？
 * 原型模式可以解决，原形模式是在内存中进行二进制流的拷贝，会比直接new一个对象，性能好很多。
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板!");
        System.out.println("初始化mail:"+mail);
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();//克隆的时候，没有调用mail的构造方法。mail和mailTemp内存地址不一样，是不同的对象。
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名:" + i + "@qq.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了!");
            System.out.println("克隆的mailTemp:"+mailTemp);
            MailUtils.sendMail(mail);
        }
        MailUtils.saveOriginMailRecord(mail);
    }
}
