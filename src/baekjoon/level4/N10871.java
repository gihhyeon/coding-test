package baekjoon.level4;

import java.util.Scanner;

public class N10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
