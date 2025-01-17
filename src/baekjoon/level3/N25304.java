package baekjoon.level3;

import java.util.Scanner;

public class N25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        int N = scanner.nextInt();
        int total = 0;

        for (int i = 0; i < N; i++) {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           total = total + a*b;
        }

        if (total == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
