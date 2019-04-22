package com.wenwen.design.pattern.structurl.facate;

/**
 * Created by sww_6 on 2019/4/22.
 */
public class GiftExchangeService {

  private IntegralService qualifyService = new IntegralService();
  private PointPaymentService pointPaymentService = new PointPaymentService();
  private ShoppingService shoppingService = new ShoppingService();

  public void giftExchange(PointGift pointGift){
   if (qualifyService.validation(pointGift)){
     if (pointPaymentService.validation(pointGift)){
       shoppingService.validation(pointGift);
     }
   }
  }
}
