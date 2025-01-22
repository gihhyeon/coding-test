package baekjoon.level4;

import java.util.Scanner;

public class N10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int k = sc.nextInt();
            for (int j = I; j <= J; j++) {
                arr[j - 1] = k;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
