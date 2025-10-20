package example;

import java.util.*;

// A=1, B=2, C=3, D=4, E=5
/**
 *       A
 *      / \
 *     B   C
 *     |   |
 *     D   E
 */
public class DfsExample {

    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " -> ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        int numNodes = 6;
        visited = new boolean[numNodes];
        for (int i = 0; i < numNodes; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(3).add(5);

        System.out.println("DFS 방문 순서: ");
        dfs(1);
    }
}
