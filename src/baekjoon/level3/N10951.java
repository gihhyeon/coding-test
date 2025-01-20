package baekjoon.level3;

import java.util.Scanner;

public class N10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);
        }
        scanner.close();
    }
}

/**
 * EOF(End of File)란?
 * 파일의 끝, 즉 데이터가 더 이상 존재하지 않을 경우.
 * hasNextInt()는 입력값이 정수일 경우 true를 반환, 아닐 경우엔 예외를 던지며
 * 입력을 받지 않고 false를 반환하며 반복문 종료.
 */
