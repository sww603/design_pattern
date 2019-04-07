package com.wenwen.design.principle.dependenceversion;

/**
 * Created by sww_6 on 2019/4/3.
 */
public class Lareina {

  /* public void studyJavaCourse() {
     System.out.println("lareina在学习java课程!");
   }

   public void studyLinuxCourse() {
     System.out.println("lareina在学习linux课程!");
   }*/
  private ICourse iCourse;

  public void setiCourse(ICourse iCourse) {
    this.iCourse = iCourse;
  }

  public Lareina(ICourse iCourse) {
    this.iCourse = iCourse;
  }
  public void studyNewCourse() {
    iCourse.studyCourse();
  }
}
