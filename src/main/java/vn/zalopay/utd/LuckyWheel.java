package vn.zalopay.utd;

public class LuckyWheel {

  private final GiftPoolService giftPoolService;
  private final PromotionService promotionService;

  protected void spin(String userId) {
    int giftId = giftPoolService.randomGift();
    promotionService.sendGiftToUser(userId, giftId);
  }


  public LuckyWheel(GiftPoolService giftPoolService, PromotionService promotionService) {
    this.giftPoolService = giftPoolService;
    this.promotionService = promotionService;
  }
}






































