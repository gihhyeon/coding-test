package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int maxgon = 1;

        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                maxgon = i;
            }
        }

        int mingon = (first * second) / maxgon;

        System.out.println(maxgon);
        System.out.println(mingon);
    }
}
