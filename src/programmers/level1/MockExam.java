package programmers.level1;

public class MockExam {
    public int[] solution(int[] answers) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == A[i % A.length]) score[0]++;
            if (answers[i] == B[i % B.length]) score[1]++;
            if (answers[i] == C[i % C.length]) score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) {
                answer[index++] = i + 1;
            }
        }

        return answer;
    }
}
