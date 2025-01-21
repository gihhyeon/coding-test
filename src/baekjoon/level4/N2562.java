package baekjoon.level4;

import java.util.Scanner;

public class N2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int maxNum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxNum = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxNum);
    }
}
