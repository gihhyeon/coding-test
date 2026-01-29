package programmers.level3;

import java.util.*;

public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                bfs(i, n, computers, visited);
            }
        }

        return answer;
    }

    public void bfs(int start, int n, int[][] computers, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {
            int current = queue.poll();

            for (int j = 0; j < n; j++) {
                if (computers[current][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    queue.add(j);
                }
            }
        }
    }
}
