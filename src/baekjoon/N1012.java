package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1012 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] map;
    static boolean[][] visited;
    static int M, N, K, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[M][N];
            visited = new boolean[M][N];
            count = 0;

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 1 && visited[i][j] == false) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);

        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}
