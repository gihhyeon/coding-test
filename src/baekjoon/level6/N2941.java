package baekjoon.level6;

import java.util.Scanner;

public class N2941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'c') {        // ch가 c라면?
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {     // ch 다음 문자가 '=' 이라면?
                        i++; // i+1까지가 하나의 크로아티아 알파벳으로 친다.
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if (ch == 'd') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'z') {
                        if (i < str.length() - 2) {
                            if (str.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    }
                    else if(str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if (ch == 'l') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if (ch == 'n') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if (ch == 's') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            else if (ch == 'z') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            count++;
        }

        System.out.println(count);
    }
}
