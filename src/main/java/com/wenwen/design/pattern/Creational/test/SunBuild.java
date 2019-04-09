package com.wenwen.design.pattern.Creational.test;

/**
 * Created by sww_6 on 2019/4/8.
 */
public class SunBuild extends Build {

  public void buildWeather() {
    map.setWeather("艳阳高照的大晴天");
  }

  public void buildHouse() {
   map.setHouse("房子玻璃再反光");
  }

  public void buildTree() {
   map.setTree("输的颜色位浅绿色");
  }

  public void buildWay() {
   map.setWay("路面干燥");
  }
}
