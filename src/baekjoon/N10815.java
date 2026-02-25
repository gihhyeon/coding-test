package baekjoon;

import java.util.*;
import java.io.*;

public class N10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            if (set.contains(target)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
