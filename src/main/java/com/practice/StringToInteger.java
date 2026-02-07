package com.practice;

public class StringToInteger {
    public int str_to_int(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;
        int sign = 1;
        int index = 0;
        int num = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            if ((num * 10 + digit)> Integer.MAX_VALUE - digit)  {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            index++;
        }

        return num * sign;
    }

    public static void main(String[] args) {
        StringToInteger sti = new StringToInteger();
        String s = " -91283472332";
        int result = sti.str_to_int(s);
        System.out.println("The converted integer is: " + result);
    }
}
