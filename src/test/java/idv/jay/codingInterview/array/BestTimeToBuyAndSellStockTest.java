package idv.jay.codingInterview.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

  @Test
  @DisplayName("測試有最大利潤")
  void testHaveMaxProfit() {
    // Arrange
    int[] prices = new int[]{7,1,5,3,6,4};

    // Ack
    int actual = BestTimeToBuyAndSellStock.maxProfit(prices);

    // Assert
    Assertions.assertEquals(5, actual);
  }

  @Test
  @DisplayName("測試沒有最大利潤")
  void testNotHaveMaxProfit() {
    // Arrange
    int[] prices = new int[]{7,6,4,3,1};

    // Ack
    int actual = BestTimeToBuyAndSellStock.maxProfit(prices);

    // Assert
    Assertions.assertEquals(0, actual);
  }
}
