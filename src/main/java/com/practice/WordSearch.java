package com.practice;

import java.util.Hashtable;

public class WordSearch {

    //Brute force approach
    public boolean exist(char[][] board, String word) {
        Hashtable<Character, Integer> charCount = new Hashtable<>();
        for (char[] topIndex : board) {
            for (char c : topIndex) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : word.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        return true;        
    }

    public static void main(String[] args) {
        WordSearch ws = new WordSearch();
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word = "ABCCED";
        boolean result = ws.exist(board, word);
        System.out.println(result);
    }

}
