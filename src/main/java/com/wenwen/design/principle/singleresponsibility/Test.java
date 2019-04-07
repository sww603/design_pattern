package com.wenwen.design.principle.singleresponsibility;

/**
 * Created by sww_6 on 2019/4/3.
 */
public class Test {
    /*public static void main(String[] args) {
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("企鹅");
    }*/
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("企鹅");
    }
}
