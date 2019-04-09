package com.wenwen.design.pattern.Creational.builder;
/**
 * Created by sww_6 on 2019/4/8.
 */
public class Test {
  public static void main(String[] args) {
    CourseBuild courseBuild = new CourseActralBuild();
    Coach coach = new Coach();
    coach.setCourseBuild(courseBuild);
    Course course = coach.makeCourse("java代码设计课程!", "java代码设计ppt!", "java代码设计视频!",
        "java代码设计手记!", "java代码设计问答!");
    System.out.println(course);
  }
}
