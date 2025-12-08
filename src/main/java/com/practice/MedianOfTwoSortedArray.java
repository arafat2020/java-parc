package com.practice;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    
    // ******* Median of Two Sorted Arrays *******
    // Brute force approach: Merge both arrays and then find the median
    // ******* Median of Two Sorted Arrays *******

    private double find_median_brute_force(int[] nums1, int[] nums2) {
        int arr_length_1 = nums1.length;
        int arr_length_2 = nums2.length;
        int[] merged_array = new int[arr_length_1 + arr_length_2];
        int merged_array_index= 0;

        for (int i = 0; i < arr_length_1; i++){
            merged_array[merged_array_index++] = nums1[i];
        }

        for (int i = 0; i < arr_length_2; i++){
            merged_array[merged_array_index++] = nums2[i];
        }
        
        Arrays.sort(merged_array);

        if (merged_array.length %2 != 0){
            return (double) merged_array[merged_array.length / 2];
        } else {
            int mid_index_1 = merged_array.length / 2;
            int mid_index_2 = mid_index_1 - 1;
            return (double) (merged_array[mid_index_1] + merged_array [mid_index_2]) / 2;
        }
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArray medianFinder = new MedianOfTwoSortedArray();
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 5};
        double median = medianFinder.find_median_brute_force(nums1, nums2);
        System.out.println("Median is: " + median); // Output: Median is: 2.0
    }
}
