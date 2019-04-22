package com.wenwen.design.pattern.Decorated.v1;

/**
 * Created by sww_6 on 2019/4/22.
 */
public class PancakesWithAgg extends Pancakes {

  @Override
  public String getDesc() {
    return super.getDesc()+"加香肠";
  }

  @Override
  public int cost() {
    return super.cost()+2;
  }
}
