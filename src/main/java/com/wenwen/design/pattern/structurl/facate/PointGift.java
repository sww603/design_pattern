package com.wenwen.design.pattern.structurl.facate;

/**
 * Created by sww_6 on 2019/4/22.
 * 积分礼物
 * 不该知道的就不知道，迪米特法则。
 */
public class PointGift {

  private String name;

  public PointGift(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}
