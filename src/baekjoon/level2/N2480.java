package baekjoon.level2;

import java.util.Scanner;

public class N2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int prize = 0;

        if (a == b && a == c) {
            prize = 10000 + a * 1000;
        } else if (a == b || a == c) {
            prize = 1000 + a * 100;
        } else if (b == c) {
            prize = 1000 + b * 100;
        } else {
            int max = a;
            if (max < b) {
                max = b;
            }
            if (max < c) {
                max = c;
            }
            prize = max * 100;
        }

        System.out.println(prize);
    }
}
