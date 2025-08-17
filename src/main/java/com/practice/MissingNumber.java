package com.practice;

import java.util.HashMap;

public class MissingNumber {
    //this is a very dumb solution, but it works
    public int missingNumber(int[] nums) {

       HashMap<Integer, Integer> countMap = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);  
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!countMap.containsKey(i)) {
                return i;
            }
        }

        return nums.length;     
    }

    public int missingNumberOptimized(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {3, 0, 1};
        int result = missingNumber.missingNumber(nums);
        System.out.println("The missing number is: " + result);
    }
}
