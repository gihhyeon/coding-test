package programmers.level1;

import java.util.Arrays;

public class KthNumber {

//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//
//        for (int i = 0; i < commands.length; i++) {
//            int start = commands[i][0] - 1;
//            int end = commands[i][1] - 1;
//            int k = commands[i][2] - 1;
//
//            int[] temp = Arrays.copyOfRange(array, start, end + 1);
//            Arrays.sort(temp);
//            answer[i] = temp[k];
//        }
//
//        return answer;
//    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] sliced = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            sliced = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(sliced);
            answer[i] = sliced[commands[i][2] - 1];
        }
        return answer;
    }
}
