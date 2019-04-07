package com.wenwen.design.principle.openclouse;

/**
 * Created by sww_6 on 2019/4/3.
 */
public class JavaDiscountCourse extends JavaCourse {

  public JavaDiscountCourse(Integer id, String name, Double price) {
    super(id, name, price);
  }

  public Double getOriginPrice() {
    return super.getPrice();
  }

  @Override
  public Double getPrice() {
    return super.getPrice() * 0.8;
  }
}
