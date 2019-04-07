package com.wenwen.design.principle.openclouse;

/**
 * Created by sww_6 on 2019/4/3.
 */
public class Test {

  public static void main(String[] args) {
    ICourse countCourse = new JavaDiscountCourse(1, "小红帽", 222d);
    JavaDiscountCourse course = (JavaDiscountCourse) countCourse;
    System.out.println(course.getOriginPrice());
    System.out.println(
        "课程id:" + course.getId() + "，课程名字：" + course.getName() + "，课程原价格：" + course.getOriginPrice()
            + ",课程打折后价格：" + course.getPrice());
  }
}
