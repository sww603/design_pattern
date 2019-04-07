package com.wenwen.design.principle.singleresponsibility;

/**
 * Created by sww_6 on 2019/4/3.
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("企鹅".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName+"用翅膀飞");
        }
    }
}
