package com.practice;

public class PalindromeNumber {
    public boolean is_palindrome(int x){
        if (x < 0) {
            return false;
        }

        int original_num = x;
        int reversed_num = 0;

        while (original_num != 0) {
            reversed_num = reversed_num*10 + original_num%10;
            original_num /= 10;
        }

        return x == reversed_num;
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        int number = 121;
        if (pn.is_palindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
