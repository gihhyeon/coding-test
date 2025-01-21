package baekjoon.level4;

import java.util.Scanner;

public class N10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int v = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
