package com.wenwen.design.pattern.Decorated.v2;

/**
 * Created by sww_6 on 2019/4/22.
 */
public class Test {

  public static void main(String[] args) {
    APancakes aPancakes;
    aPancakes = new Pancakes();
    aPancakes = new AggDecorator(aPancakes);
    aPancakes = new AggDecorator(aPancakes);
    aPancakes = new SausageDecorator(aPancakes);
    System.out.println(aPancakes.getDesc()+"销售价格："+aPancakes.cost());
    /*Ccc ccc = new Ccc();
    ccc.aaa();
    ccc.bbb();
    System.out.println(ccc);*/
  }
}
