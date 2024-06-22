class  TimetoBuyandSellStock {

  int maxProfit(int[] prices) {
    int buy_price = prices[0];
    int profit = 0;

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < buy_price) {
        buy_price = prices[i];
      }
      else {
        int current_profit = prices[i] - buy_price;
        profit = Math.max(current_profit, profit);
      }
    }

    return profit;
  }

}