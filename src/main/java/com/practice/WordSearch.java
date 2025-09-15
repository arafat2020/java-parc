package com.practice;

import java.util.Hashtable;
import java.util.Set;

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


    public boolean existOptimized(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        Set<String> visited = new java.util.HashSet<>();
        Hashtable<Character, Integer> charCount = new Hashtable<>();
        
        for (char[] topIndex : board) {
            for (char c : topIndex) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // if (dfs(board, word, 0, i, j, visited)) {
                //     return true;
                // }
            }
        }
        return false;
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
