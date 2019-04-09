package com.wenwen.design.pattern.Creational.test;

/**
 * Created by sww_6 on 2019/4/8.
 */
public class CloudyBuild extends Build {

  public void buildWeather() {
    map.setWeather("下雨天");
  }

  public void buildHouse() {
  map.setHouse("房子颜色灰暗");
  }

  public void buildTree() {
   map.setTree("树的颜色是深绿色");
  }

  public void buildWay() {
    map.setWay("道路湿滑");
  }
}
