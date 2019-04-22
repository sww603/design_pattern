package com.wenwen.design.pattern.structurl.facate;

/**
 * Created by sww_6 on 2019/4/22.
 */
public class ShoppingService implements Executive{

  public String getOrderNo(PointGift pointGift) {
    return null;
  }
  public boolean validation(PointGift pointGift) {
    //物流系统的对接逻辑
    System.out.println(pointGift.getName() + "进入物流系统!"+"单号：666");
    return true;
  }
}
