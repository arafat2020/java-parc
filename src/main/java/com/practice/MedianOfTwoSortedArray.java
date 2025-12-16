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
        int merged_array_index = 0;

        for (int i = 0; i < arr_length_1; i++) {
            merged_array[merged_array_index++] = nums1[i];
        }

        for (int i = 0; i < arr_length_2; i++) {
            merged_array[merged_array_index++] = nums2[i];
        }

        Arrays.sort(merged_array);

        if (merged_array.length % 2 != 0) {
            return (double) merged_array[merged_array.length / 2];
        } else {
            int mid_index_1 = merged_array.length / 2;
            int mid_index_2 = mid_index_1 - 1;
            return (double) (merged_array[mid_index_1] + merged_array[mid_index_2]) / 2;
        }
    }

    // ******* Median of Two Sorted Arrays *******
    // Two pointer approach: Merge both arrays and then find the median
    // ******* Median of Two Sorted Arrays *******

    private double find_median_two_pointer(int[] nums1, int[] nums2) {
        int nums1_length = nums1.length;
        int nums2_length = nums2.length;
        int nums1_index = 0;
        int nums2_index = 0;
        int mid1 = 0;
        int mid2 = 0;

        for (int i = 0; i <= (nums1_length + nums2_length) / 2; i++) {
            mid2 = mid1;
            if (nums1_index != nums1_length && nums2_index != nums2_length) {
                if (nums1[nums1_index] > nums2[nums2_index]) {
                    mid1 = nums2[nums2_index++];
                } else {
                    mid1 = nums1[nums1_index++];
                }
            } else if (nums1_index < nums1_length) {
                mid1 = nums1[nums1_index++];
            } else {
                mid1 = nums2[nums2_index++];
            }
        }
        ;

        if (((nums1_length + nums2_length) % 2) != 0) {
            return (double) mid1;
        } else {
            return (double) (mid1 + mid2) / 2;
        }
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArray medianFinder = new MedianOfTwoSortedArray();
        int[] nums1 = {};
        int[] nums2 = { 1 };
        double median = medianFinder.find_median_two_pointer(nums1, nums2);
        System.out.println("Median is: " + median); // Output: Median is: 2.0
    }
}
