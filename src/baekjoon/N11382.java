package baekjoon;

import java.util.Scanner;

public class N11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();

        scanner.close();

        System.out.println(A + B + C);
    }
}

/**
 * int 형으로 작성하면 런타임 에러 발생
 * long 형으로 작성하자.
 */
