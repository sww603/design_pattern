package com.wenwen.design.pattern.Creational.abstractFactory;
/**
 * Created by sww_6 on 2019/4/7.
 */
public class JavaFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
