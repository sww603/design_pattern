package com.wenwen.design.pattern.Creational.test;

/**
 * Created by sww_6 on 2019/4/8.
 * 指挥者 MapDirector，指挥构建过程
 */
public class MapDirector {

  public Map constract(Build build){
    Map map;
    build.buildWeather();
    build.buildHouse();
    build.buildTree();
    build.buildWay();
    map = build.createMap();
    return map;
  }
}
