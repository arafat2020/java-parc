package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
       if (s.length() == 1 || s.length() <= numRows || numRows == 1)
            return s;

        int idx = 0;
        int dir = 0;
        @SuppressWarnings("unchecked")
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }
        for (char c : s.toCharArray()) {
            rows[idx].add(c);
            if (idx == 0) {
                dir = 1;
            }
            if (idx == rows.length - 1) {
                dir = -1;
            }
            idx += dir;
        }

        StringBuilder zigzag_str = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                zigzag_str.append(c);
            }
        }

        return zigzag_str.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String result = zigzagConversion.convert("AB", 1);
        System.out.println(result); // Output: "PAHNAPLSIIGYIR"
    }
}
