package com.wenwen.design.pattern.Creational.builder.v2;

/**
 * Created by sww_6 on 2019/4/8.
 */
public class Test {

  public static void main(String[] args) {
    Course course = new Course.CourseBuild().buildCourseName("java精讲").buildCourseVideo("java视频")
        .buildCourseArtical("java讲义").buildCcoursePpt("java课程ppt").buildCourseQA("java问答").build();
    System.out.println(course);
  }
}
