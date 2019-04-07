package com.wenwen.design.pattern.Creational.abstractFactory;

/**
 * Created by sww_6 on 2019/4/7.
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaFactory();
        Video video = factory.getVideo();
        video.produce();
        Article article = factory.getArticle();
        article.produce();
    }
}
