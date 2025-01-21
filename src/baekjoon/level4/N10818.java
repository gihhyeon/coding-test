package baekjoon.level4;

import java.util.Arrays;
import java.util.Scanner;

public class N10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n - 1]);
    }
}
