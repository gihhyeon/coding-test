package baekjoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        if (s.equals(sb.reverse().toString())) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}