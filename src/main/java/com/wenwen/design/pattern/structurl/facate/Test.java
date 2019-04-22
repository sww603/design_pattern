package com.wenwen.design.pattern.structurl.facate;

/**
 * 应用层绝对不能关心子系统，子系统只和外观类通信，应用层只和外观类通信。
 * 子系统不经常变化的话，可以用实体外观类
 * 子系统经常变化的话，需要使用抽象外观类。
 * Created by sww_6 on 2019/4/22.
 */
public class Test {
  public static void main(String[] args) {
    PointGift pointGift = new PointGift("卫衣");
    GiftExchangeService giftExchangeService =new GiftExchangeService();
    giftExchangeService.giftExchange(pointGift);
  }
}
