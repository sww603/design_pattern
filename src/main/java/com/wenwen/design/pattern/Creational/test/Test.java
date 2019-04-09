package com.wenwen.design.pattern.Creational.test;

/**
 * Created by sww_6 on 2019/4/8.
 */
public class Test {

  public static void main(String[] args) {
    Build build = new SunBuild();
    MapDirector director = new MapDirector();
    Map constract = director.constract(build);
    System.out.println(constract);
  }
}
