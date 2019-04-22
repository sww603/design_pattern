package com.wenwen.design.pattern.Decorated.v2;

/**
 * Created by sww_6 on 2019/4/22.
 */
public class SausageDecorator extends AbstrctDecorator {

  public SausageDecorator(APancakes pancakes) {
    super(pancakes);
  }

  @Override
  public String getDesc() {
    return super.getDesc()+"加一个香肠";
  }

  @Override
  public int cost() {
    return super.cost()+2;
  }
}
