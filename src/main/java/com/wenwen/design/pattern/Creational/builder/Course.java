package com.wenwen.design.pattern.Creational.builder;

/**
 * Created by sww_6 on 2019/4/7.
 */
public class Course {
    private String courseName;
    private String coursePpt;
    private String courseVideo;
    private String courseArtical;

    private String courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePpt() {
        return coursePpt;
    }

    public void setCoursePpt(String coursePpt) {
        this.coursePpt = coursePpt;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArtical() {
        return courseArtical;
    }

    public void setCourseArtical(String courseArtical) {
        this.courseArtical = courseArtical;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePpt='" + coursePpt + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArtical='" + courseArtical + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
