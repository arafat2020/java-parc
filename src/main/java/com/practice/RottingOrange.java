package com.practice;

public class RottingOrange {
    public int orangesRotting(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                   System.out.println("Rotten orange found at: (" + i + ", " + j + ")");
                }
            }
        }
        return 5;
    }

    public static void main(String[] args) {
        RottingOrange rottingOrange = new RottingOrange();
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        int result = rottingOrange.orangesRotting(grid);
        System.out.println("Minimum time to rot all oranges: " + result);
    }
}
