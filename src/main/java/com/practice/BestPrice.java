package com.practice;

public class BestPrice {
    public int maxProfit(int[] prices) {
        int initialPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > initialPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - initialPrice);
            } else {
                initialPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
