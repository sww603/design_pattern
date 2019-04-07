package com.wenwen.design.principle.dependenceversion;

/**
 * Created by sww_6 on 2019/4/3.
 */
public class Test {

  /* public static void main(String[] args) {
     Lareina lareina = new Lareina();
     lareina.studyJavaCourse();
     lareina.studyLinuxCourse();
   }*/
 /*public static void main(String[] args) {
   Lareina lareina = new Lareina();
   lareina.studyNewCourse(new JavaCourse());
   lareina.studyNewCourse(new LinuxCourse());
 }*/
 /* public static void main(String[] args) {
    Lareina lareina = new Lareina(new JavaCourse());
    lareina.studyNewCourse();
  }*/

  public static void main(String[] args) {
    Lareina lareina = new Lareina(new JavaCourse());
    lareina.setiCourse(new JavaCourse());
    lareina.studyNewCourse();

    lareina.setiCourse(new LinuxCourse());
    lareina.studyNewCourse();
  }
}
