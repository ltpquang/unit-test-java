package vn.zalopay.utd;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LuckyWheelTest {

  @Test
  void spin() {
    // Create test doubles
    GiftPoolService giftPoolService = Mockito.mock(GiftPoolService.class);
    PromotionService promotionService = Mockito.mock(PromotionService.class);

    // Stub the query
    Mockito.when(giftPoolService.randomGift()).thenReturn(12);

    // Exercise
    LuckyWheel luckyWheel = new LuckyWheel(giftPoolService, promotionService);
    luckyWheel.spin("123abc");

    // Mock the command
    Mockito.verify(promotionService).sendGiftToUser("123abc", 12);
  }
}