package com.wenwen.design.principle.openclouse;

/**
 * Created by sww_6 on 2019/4/3.
 */
public class JavaCourse implements ICourse {

  private Integer id;
  private String name;
  private Double price;

  public JavaCourse(Integer id, String name, Double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public Integer getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Double getPrice() {
    return this.price;
  }
}
