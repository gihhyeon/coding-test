//package baekjoon.level4;
//
//import java.util.Scanner;
//
//public class N10811 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int[] arr = new int[N];
//        int temp;
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = i + 1;
//        }
//
//        for (int i = 0; i < M; i++) {
//            int I = sc.nextInt();
//            int J = sc.nextInt();
//
//            for (int k = 0; k < arr.length / 2; k++) {
//                temp = arr[I];
//                arr[I] = arr[J];
//                arr[J] = temp;
//            }
//        }
//        sc.close();
//        for (int i = 0; i < N; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
