package com.wenwen.design.pattern.Creational.simplefactory;

/**
 * Created by sww_6 on 2019/4/6.
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);

        //Video video = videoFactory.getVideo("java");

        if (video == null) {
            return;
        }
        video.produce();
        /*Video video = new JavaVideo();
        video.produce();*/
    }
}
