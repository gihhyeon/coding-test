package example;

import java.util.*;

public class DfsStackExample {

    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] vistied;

    public static void dfsWithStack(int startNode) {
        Stack<Integer> stack = new Stack<>();

        stack.push(startNode);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (vistied[node]) {
                continue;
            }

            vistied[node] = true;
            System.out.print(node + " -> ");

            List<Integer> neighbors = graph.get(node);
            for (int i = neighbors.size() - 1; i >= 0; i--) {
                int neighbor = neighbors.get(i);
                if (!vistied[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int numNodes = 6;
        vistied = new boolean[numNodes];

        for (int i = 0; i < numNodes; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(3).add(5);

        System.out.println("DFS 방문 순서: ");
        dfsWithStack(1);
    }
}
