package com.practice;

public class CoinChange {
    public Integer[][] memo;
    private int solution_recursive(int[] coins, int amount) {
        memo = new Integer[coins.length + 1][amount + 1];
        return find_min_coins_dp(coins, coins.length, amount);
    }

    private int find_min_coins_dp(int[] coins, int index, int amount) {
        if (amount == 0)
            return 1;
        if (index <= 0)
            return 0;

        if (memo[index][amount] != null) return memo[index][amount];

        int skip_coin = find_min_coins_dp(coins, index -1, amount);
        int take_coin = 0;
        if (coins[index -1] <= amount) 
            take_coin = find_min_coins_dp(coins, index, amount - coins[index -1]);

        return memo[index][amount] = skip_coin + take_coin;
    }
            

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        int[] coins = { 1, 2, 5 };
        int amount = 5;
        int result = cc.solution_recursive(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
}
