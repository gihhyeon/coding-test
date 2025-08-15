package baekjoon;

import java.io.*;
import java.util.*;

public class N29723 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 과목명 - 점수
        Map<String, Integer> score = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            int p = Integer.parseInt(st.nextToken());
            score.put(subject, p);
        }

        int base = 0; // 공개된 K과목 합
        for (int i = 0; i < K; i++) {
            String openSubj = br.readLine();
            Integer v = score.remove(openSubj);
            if (v != null) base += v;
        }

        int need = M - K; // 추가로 뽑아야 할 과목 수
        if (need == 0) {
            System.out.println(base + " " + base);
            return;
        }

        // 남은 과목들의 점수만 모아 정렬
        int[] rest = new int[score.size()];
        int idx = 0;
        for (int v : score.values()) {
            rest[idx++] = v;
        }
        Arrays.sort(rest);

        int minSum = base;
        int maxSum = base;

        // 최소합: 작은 것부터 need개
        for (int i = 0; i < need; i++) {
            minSum += rest[i];
        }
        // 최대합: 큰 것부터 need개
        for (int i = 0; i < need; i++) {
            maxSum += rest[rest.length - 1 - i];
        }

        System.out.println(minSum + " " + maxSum);
    }
}
