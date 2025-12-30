package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOrange {
    public int orangesRotting(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int[][] visited = grid;
        Queue<int[]> queue = new LinkedList<>();
        int fresh_count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (visited[i][j] == 2) {
                    queue.offer(new int[] { i, j });
                }
                if (visited[i][j] == 1) {
                    fresh_count++;
                }
            }
        }

        if (fresh_count == 0) {
            return 0;
        }
        if (queue.isEmpty()) {
            return -1;
        }

        int minutes = 0;
        int[][] directions = {
                { 0, 1 },
                { 0, -1 },
                { 1, 0 },
                { -1, 0 }
        };
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] cell = queue.poll();
                int m = cell[0];
                int n = cell[1];
                boolean infected = false;
                for (int[] dir : directions) {
                    int i = m + dir[0];
                    int j = n + dir[1];
                    if (i >= 0 && i < x && j >= 0 && j < y && visited[i][j] == 1) {
                        visited[i][j] = 2;
                        fresh_count--;
                        queue.offer(new int[] { i, j });
                        infected = true;
                    }
                }

                if (infected) {
                    minutes++;}
            }
        }

        if (fresh_count == 0) {
            return minutes;
        }

        return -1;

    }

    public static void main(String[] args) {
        RottingOrange rottingOrange = new RottingOrange();
        int[][] grid = {
                { 2, 1, 1 },
                { 1, 1, 0 },
                { 0, 1, 1 }
        };
        int result = rottingOrange.orangesRotting(grid);
        System.out.println("Minimum time to rot all oranges: " + result);
    }
}
