package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) {
            int small = 0;
            int big = 0;
            int num = 0;
            int blank = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    small++;
                } else if (c >= 'A' && c <= 'Z') {
                    big++;
                } else if (c >= '0' && c <= '9') {
                    num++;
                } else if (c == ' ') {
                    blank++;
                }
            }

            System.out.printf("%d %d %d %d\n", small, big, num, blank);
        }
    }
}
