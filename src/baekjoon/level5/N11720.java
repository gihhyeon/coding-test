package baekjoon.level5;


import java.util.Scanner;

public class N11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s= sc.next();
        sc.close();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += s.charAt(i) - '0';
        }
        System.out.print(sum);
    }
}
