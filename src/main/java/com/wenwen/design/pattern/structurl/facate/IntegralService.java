package com.wenwen.design.pattern.structurl.facate;

/**
 * Created by sww_6 on 2019/4/22.
 */
public class IntegralService implements Executive {

  public boolean validation(PointGift pointGift) {
    System.out.println("校验" + pointGift.getName() + "积分资格通过");
    return true;
  }
}
