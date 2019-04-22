package com.wenwen.design.pattern.Decorated.v1;

/**
 * Created by sww_6 on 2019/4/22.
 */
public class PancakesWithAggAndSausage extends Pancakes{

  @Override
  public String getDesc() {
    return super.getDesc()+"加鸡蛋加香肠";
  }

  @Override
  public int cost() {
    return super.cost()+2+2;
  }
}
