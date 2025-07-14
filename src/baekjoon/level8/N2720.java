package baekjoon.level8;

import java.util.Scanner;

public class N2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();

            int q = c / 25;
            c %= 25;

            int d = c / 10;
            c %= 10;

            int n = c / 5;
            c %= 5;

            int p = c;

            System.out.println(q + " " + d + " " + n + " " + p);
        }
        sc.close();

    }
}
