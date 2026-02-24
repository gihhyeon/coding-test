package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int[] counts = new int[26];

        for (int i = 0; i < str.length(); i++) {
            counts[str.charAt(i) - 'A']++;
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (counts[i] > max) {
                result = (char) (i + 'A');
            } else if (counts[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
