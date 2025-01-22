package baekjoon.level4;

import java.util.HashSet;
import java.util.Scanner;

public class N3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt() % 42);
        }

        sc.close();
        System.out.println(h.size());
    }
}

/**
 * 문제에서 "서로 다른"이 핵심
 * HashSet을 사용하면 자연스레 나머지 값이 HashSet 원소에 저장되어
 * 중복일 경우 저장되지 않고 HashSet에 없으면 저장.
 */
