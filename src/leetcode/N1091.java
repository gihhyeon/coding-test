package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class N1091 {

    int[] dr = {0, 1, -1, -1, 0, 1, 1, -1};
    int[] dc = {1, 1, 0, -1, -1, -1, 0, 1};

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        boolean[][] visited = new boolean[n][n];

        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        return bfs(grid, visited);
    }

    private int bfs(int[][] grid, boolean[][] visited) {
        int n = grid.length;
        Queue<int[]> queue = new LinkedList<>();

        visited[0][0] = true;
        queue.add(new int[] {0, 0, 1});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];
            int distance = cur[2];

            if (r == n - 1 && c == n - 1) {
                return distance;
            }

            for (int i = 0; i < 8; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == 0 && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.add(new int[] {nr, nc, distance + 1});
                }
            }
        }

        return -1;
    }
}
