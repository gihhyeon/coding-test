package baekjoon.level4;

import java.util.Scanner;

public class N10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int temp;

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        for (int j = 0; j < m; j++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            temp = arr[I - 1];
            arr[I - 1] = arr[J - 1];
            arr[J - 1] = temp;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
