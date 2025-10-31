package programmers.level2;

import java.util.*;

public class FunctionDevelopment {
    public List solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remainWork = 100 - progresses[i];
            int days = (remainWork + speeds[i] - 1) / speeds[i];
            q.add(days);
        }

        while (!q.isEmpty()) {
            int maxDay = q.poll();
            int count = 1; // 배포 그룹에 포함된 기능 수

            while (!q.isEmpty() && q.peek() <= maxDay) {
                q.poll();
                count++;
            }

            answer.add(count);
        }

        return answer;

    }
}
