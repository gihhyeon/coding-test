package programmers.level0;

import java.util.*;

public class CountUP {
    public List solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            answer.add(i);
        }

        return answer;
    }
}
