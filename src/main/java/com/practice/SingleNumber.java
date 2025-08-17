package com.practice;

import java.util.HashMap;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) {
                System.out.println("Single number found: " + num);
                return num;
            }        
        }
        return -1;   
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
