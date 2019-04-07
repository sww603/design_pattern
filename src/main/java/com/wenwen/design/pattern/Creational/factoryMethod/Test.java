package com.wenwen.design.pattern.Creational.factoryMethod;

/**
 * Created by sww_6 on 2019/4/6.
 */
public class Test {
    public static void main(String[] args) {
        /*VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();*/
        Video video =new JavaVideo();
        video.produce();
    }
}
