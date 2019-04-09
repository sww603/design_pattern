package com.wenwen.design.pattern.Creational.builder;

/**
 * Created by sww_6 on 2019/4/7.
 */
public class CourseActralBuild extends CourseBuild {

    private Course course = new Course();

    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    public void buildCcoursePpt(String coursePpt) {
        course.setCoursePpt(coursePpt);
    }

    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    public void buildCourseArtical(String courseArtical) {
        course.setCourseArtical(courseArtical);
    }

    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    public Course makeCourse() {
        return course;
    }
}
