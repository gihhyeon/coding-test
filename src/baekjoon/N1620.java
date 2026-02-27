package baekjoon;

import java.util.*;
import java.io.*;

public class N1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> numMap = new HashMap<>();
        HashMap<String, Integer> nameMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            numMap.put(i, s);
            nameMap.put(s, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String query = br.readLine();

            if (Character.isDigit(query.charAt(0))) {
                int num = Integer.parseInt(query);
                sb.append(numMap.get(num)).append("\n");
            } else {
                sb.append(nameMap.get(query)).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
