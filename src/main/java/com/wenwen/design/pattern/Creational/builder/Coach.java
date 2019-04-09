package com.wenwen.design.pattern.Creational.builder;

/**
 * Created by sww_6 on 2019/4/8.
 */
public class Coach {

  private CourseBuild courseBuild;

  public void setCourseBuild(CourseBuild courseBuild){
   this.courseBuild = courseBuild;
  }
  public Course makeCourse(String courseName,String coursePpt,
      String courseVideo,String courseArtical,String courseQA){
    this.courseBuild.buildCourseName(courseName);
    this.courseBuild.buildCcoursePpt(coursePpt);
    this.courseBuild.buildCourseVideo(courseVideo);
    this.courseBuild.buildCourseArtical(courseArtical);
    this.courseBuild.buildCourseQA(courseQA);
    return this.courseBuild.makeCourse();
  }
}
