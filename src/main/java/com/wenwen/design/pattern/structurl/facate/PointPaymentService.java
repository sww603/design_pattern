package com.wenwen.design.pattern.structurl.facate;

/**
 * Created by sww_6 on 2019/4/22.
 */
public class PointPaymentService implements Executive {

  public boolean validation(PointGift pointGift) {
    System.out.println("支付" + pointGift.getName() + "积分成功");
    return true;
  }
}
