package baekjoon.level5;

import java.util.Scanner;

public class N9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String s = sc.next();
//            System.out.print(s.charAt(0) + s.charAt(s.length() - 1)); // 두 값이 char 타입이기 때문에, 이 두 값을 더하면 해당 문자의 유니코드 값을 더하게 됨.
            // char 타입은 내부적으로 정수형 데이터로 처리됨.
            System.out.print("" + s.charAt(0) + s.charAt(s.length() - 1) + "\n");
        }
    }
}
