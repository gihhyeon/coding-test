package baekjoon;

import java.util.Scanner;

public class N10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);

    }
}
