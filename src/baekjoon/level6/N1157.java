package baekjoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class N1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; // 영문자의 개수는 26개
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {

            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                arr[s.charAt(i) - 'A']++; // ex. C를 입력 받았을 때, 배열의 세 번째 원소인 2를 도출해내기
            } else {
                arr[s.charAt(i) - 'a']++; // ex. e를 입력받았을 때 다섯 번째 원소인 4를 도출해야되니 97(a)을 빼줘야됨
            }
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);

    }
}


/**
 * 대문자 A~Z의 범위는 십진수로 65 ~ 90
 * 소문자의 범위는 97 ~ 122
 */
