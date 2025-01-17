package baekjoon.level2;

import java.util.Scanner;

public class N2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int t = scanner.nextInt();

        int min = h * 60 + m;
        min = min + t;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);

    }
}
