package com.wenwen.design.pattern.Creational.builder;

/**
 * Created by sww_6 on 2019/4/7.
 */
public abstract class CourseBuild {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCcoursePpt(String coursePpt);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArtical(String courseArtical);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();

}
