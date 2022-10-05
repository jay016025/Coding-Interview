package idv.jay.codingInterview.array;

/**
 * leetcode 121
 */
public class BestTimeToBuyAndSellStock {

  private BestTimeToBuyAndSellStock() {throw new IllegalStateException("Demo class");}

  public static int maxProfit(int[] prices) {
    int min_price = Integer.MAX_VALUE;
    int res = 0;
    for (int price : prices) {
      min_price = Math.min(min_price, price);
      res = Math.max(res, price - min_price);
    }

    return res;
  }
}
