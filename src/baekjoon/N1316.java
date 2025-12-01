package baekjoon;

import java.util.Scanner;

public class N1316 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean check() {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {

                // 문자가 처음 나오는 경우
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else { // 해당 문자가 이미 나온 적이 있는 경우
                    return false;
                }

            }
        }
        return true;
    }
}
