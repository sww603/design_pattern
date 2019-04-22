package com.wenwen.design.pattern.Decorated.v2;

/**
 * Created by sww_6 on 2019/4/22.
 */
public class AbstrctDecorator extends APancakes {

  private APancakes pancakes;

  public AbstrctDecorator(APancakes pancakes) {
    this.pancakes = pancakes;
  }

  public String getDesc() {
    return this.pancakes.getDesc();
  }

  public int cost() {
    return this.pancakes.cost();
  }
}
