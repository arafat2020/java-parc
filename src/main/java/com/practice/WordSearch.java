package com.practice;

import java.util.Hashtable;
import java.util.Set;

public class WordSearch {

    private Set<String> visited = new java.util.HashSet<>();
    private int rows;
    private int cols;

    // Brute force approach
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
        // still suck at time complexity, damnit!!!!!
        rows = board.length;
        cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (bfs(board, word, i, j, 0)) {
                    return true;
                }
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
        boolean result = ws.existOptimized(board, word);
        System.out.println(result);
    }

    private boolean bfs(char[][] board, String word, int row, int col, int index) {
        if (word.length() == index) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length
                || board[row][col] != word.charAt(index) || visited.contains(row + "," + col)) {
            return false;
        }
        visited.add(row + "," + col);
        boolean found = bfs(board, word, row + 1, col, index + 1)
                || bfs(board, word, row - 1, col, index + 1)
                || bfs(board, word, row, col + 1, index + 1)
                || bfs(board, word, row, col - 1, index + 1);
        visited.remove(row + "," + col);
        return found;
    }

}
