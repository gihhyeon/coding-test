package baekjoon.string;

import java.util.Scanner;

public class N1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr[0].length(); i++) {
            boolean bool = true;
            for (int j = 0; j < N; j++) {
                if (arr[0].charAt(i) != arr[j].charAt(i)) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                sb.append(arr[0].charAt(i));
            } else {
                sb.append("?");
            }
        }
        System.out.println(sb);
    }
}
