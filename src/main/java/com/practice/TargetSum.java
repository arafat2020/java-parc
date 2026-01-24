package com.practice;
import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    private Map<String, Integer> memo = new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        int nums_index = nums.length - 1;
        int current_sum = 0;
        return dp(nums_index, current_sum, target, nums);
    }

    private int dp(int index, int current_sum, int target, int[] nums){
        if (index < 0 && current_sum == target) return 1;
        if (index < 0) return 0;

        String key = index + "," + current_sum;
        if(memo.containsKey(key)) return memo.get(key);

        int positive = dp(index -1, current_sum + nums[index], target, nums);
        int negative = dp(index -1, current_sum - nums[index], target, nums);
        int comb_sum = positive + negative;
        memo.put(key, comb_sum);
        return comb_sum;
    }

    public static void main(String[] args) {
        TargetSum ts = new TargetSum();
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        int ways = ts.findTargetSumWays(nums, target);
        System.out.println("Number of ways to reach target sum: " + ways);
    }
}
