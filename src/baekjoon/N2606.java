package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2606 {

    static int[][] graph;
    static boolean[] visited;
    static int n, connections, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        connections = Integer.parseInt(br.readLine());

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        count = 0;

        for (int i = 0; i < connections; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }

        dfs(1);
        System.out.println(count - 1);
    }

    public static void dfs(int index) {
        visited[index] = true;
        count++;

        for (int i = 1; i <= n; i++) {
            if (graph[index][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }


}
