package baekjoon;

import java.io.*;

public class N9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] words = br.readLine().split(" ");

            for (String s : words) {
                StringBuilder sb = new StringBuilder(s);
                System.out.print(sb.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
