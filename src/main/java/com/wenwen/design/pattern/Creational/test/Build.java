package com.wenwen.design.pattern.Creational.test;

/**
 * Created by sww_6 on 2019/4/8.
 */
public abstract class Build {

  protected Map map =new Map();
  public abstract void buildWeather();
  public abstract void buildHouse();
  public abstract void buildTree();
  public abstract void buildWay();
  public Map createMap(){
    return map;
  }
}
