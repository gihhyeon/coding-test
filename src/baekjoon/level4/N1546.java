package baekjoon.level4;

import java.util.Scanner;

public class N1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] arr = new double[N];
        double avg, max = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            arr[i] = (arr[i] / max) * 100;
            sum += arr[i];
        }
        sc.close();

        avg = sum / N;
        System.out.println(avg);
    }
}
