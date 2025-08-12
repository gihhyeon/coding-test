package baekjoon;

import java.io.*;
import java.util.*;

// 평행선
public class N2358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        Map<Integer, Integer> cx = new HashMap<>();
        Map<Integer, Integer> cy = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().trim().split("\\s+");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            cx.put(x, cx.getOrDefault(x, 0) + 1);
            cy.put(y, cy.getOrDefault(y, 0) + 1);
        }

        int answer = 0;
        for (int v : cx.values()) if (v >= 2) answer++;
        for (int v : cy.values()) if (v >= 2) answer++;

        System.out.println(answer);
    }
}
