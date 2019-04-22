package com.wenwen.design.pattern.Decorated.v1;

/**
 * Created by sww_6 on 2019/4/22.
 */
public class Test {

  public static void main(String[] args) {
    Pancakes pancakes = new Pancakes();
    System.out.println(pancakes.getDesc() + "销售价格：" + pancakes.cost());

    PancakesWithAgg pancakesWithAgg = new PancakesWithAgg();
    System.out.println(pancakesWithAgg.getDesc() + "销售价格：" + pancakesWithAgg.cost());

    PancakesWithAggAndSausage pancakesWithAggAndSausage = new PancakesWithAggAndSausage();
    System.out.println(pancakesWithAggAndSausage.getDesc() + "销售价格：" + pancakesWithAggAndSausage.cost());
  }

}
