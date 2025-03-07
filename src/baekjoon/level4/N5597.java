package baekjoon.level4;

import java.util.Scanner;

public class N5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] students = new int[30];

        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            students[n - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (students[i] != 1) {
                System.out.println(i + 1);
            }
        }
    }
}
