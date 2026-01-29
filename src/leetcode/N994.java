package leetcode;

import java.util.*;

public class N994 {
    public int orangesRotting(int[][] grid) {
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 2) {
                    queue.add(new int[]{r, c, 0});
                } else if (grid[r][c] == 1) {
                    freshOranges++;
                }
            }
        }

        int minutes = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];
            int time = cur[2];
            minutes = time;

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;
                    freshOranges--;
                    queue.add(new int[] {nr, nc, time + 1});
                }
            }
        }

        if (freshOranges == 0) {
            return minutes;
        } else {
            return -1;
        }

    }
}
