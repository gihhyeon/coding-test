package baekjoon;

import java.util.*;
import java.io.*;

public class N1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int answer = 64;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {

                int count = 0;
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        char expected = ((x + y) % 2 == 0) ? 'W' : 'B';

                        if (board[i + x][j + y] != expected) {
                            count++;
                        }
                    }
                }

                answer = Math.min(answer, Math.min(count, 64 - count));
            }
        }
        System.out.println(answer);
    }
}
