package com.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public int get_substring_length(String string) {
        int left_pointer = 0;
        int max_length = 0;
        Set<Character> char_set = new HashSet<>();
        char[] char_array = string.toCharArray();
        for (int right_pointer = 0; right_pointer < char_array.length; right_pointer++) {
            char current_char = char_array[right_pointer];
            while (char_set.contains(current_char)) {
                if (char_set.contains(current_char)) {
                    char_set.remove(char_array[left_pointer]);
                    left_pointer++;
                }

            }
            char_set.add(current_char);
            max_length = Math.max(max_length, right_pointer - left_pointer + 1);
        }

        return max_length;
    }

    public static void main(String[] args) {
        LongestSubString longestSubString = new LongestSubString();
        int result = longestSubString.get_substring_length("abcabcbb");
        System.out.println(result);
    }

}
