package com.practice;

public class ReverseInteger {
    private int reverse_integer(int x) {
        int revered_int = 0;
        boolean is_negative = x < 0;
        String str_num = Integer.toString(Math.abs(x));
        StringBuilder reverse_str_num = new StringBuilder(str_num).reverse();
        try {
            revered_int = Integer.parseInt(reverse_str_num.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        return is_negative ? -revered_int : revered_int;

    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        int number = 556;
        int reversed_number = ri.reverse_integer(number);
        System.out.println("Reversed Integer: " + reversed_number);
    }
}
