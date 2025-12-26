package com.practice;

public class LongestPalindromicSubstring {

    private static String longestPalindrome(String s) {
        int str_lenght = s.length();
        if (str_lenght <= 1) {
            return s;
        }
        String longest_palindrome = s.substring(0, 1);
        for (int i = 0; i < str_lenght - 1; i++) {
            String odd_palindrome = expend_from_center(s, i, i);
            System.out.println("odd_palindrome=" + odd_palindrome);
            String even_palindrome = expend_from_center(s, i, i + 1);
            System.out.println("even_palindrome=" + even_palindrome);
            if (odd_palindrome.length() > longest_palindrome.length()) {
                longest_palindrome = odd_palindrome;

            }
            if (even_palindrome.length() > longest_palindrome.length()) {
                longest_palindrome = even_palindrome;
            }
        }
        return longest_palindrome;
    }

    private static String expend_from_center(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        System.out.println("left=" + left + ", right=" + right);
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
