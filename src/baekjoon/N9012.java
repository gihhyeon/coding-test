package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int cnt = 0;
            boolean bool = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    cnt ++;
                } else {
                    cnt--;
                }
                if (cnt < 0) {
                    bool = false;
                    break;
                }
            }

            if (bool && cnt == 0) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }


        }

        System.out.println(sb.toString());
    }
}
