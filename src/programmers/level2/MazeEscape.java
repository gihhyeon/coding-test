package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class MazeEscape {

    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};

    public int Solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();

        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];

        for (int i = 0; i < n; i++) {
            int sCol = maps[i].indexOf('S');
            int lCol = maps[i].indexOf('L');
            int eCol = maps[i].indexOf('E');

            if (sCol != -1) {
                start[0] = i;
                start[1] = sCol;
            }
            if (lCol != -1) {
                lever[0] = i;
                lever[1] = lCol;
            }
            if (eCol != -1) {
                exit[0] = i;
                exit[1] = eCol;
            }
        }

        int toLever = bfs(start[0], start[1], lever[0], lever[1], maps);
        if (toLever == -1) return -1;

        int toExit = bfs(lever[0], lever[1], exit[0], exit[1], maps);
        if (toExit == -1) return -1;

        return toLever + toExit;

    }

    private int bfs(int startR, int startC, int targetR, int targetC, String[] maps) {
        int n = maps.length;
        int m = maps[0].length();

        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                distance[i][j] = -1;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {startR, startC});
        distance[startR][startC] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m && maps[nr].charAt(nc) != 'X' && distance[nr][nc] == -1) {
                    distance[nr][nc] = distance[r][c] + 1;
                    queue.add(new int[] {nr, nc});
                }
            }
        }
        return -1;
    }
}
