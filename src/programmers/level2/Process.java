package programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Process {
    class Solution {
        public int solution(int[] priorities, int location) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int answer = 0;

            for (int n : priorities) {
                pq.add(n);
            }

            while (!pq.isEmpty()) {
                for (int i = 0; i < pq.size(); i++) {
                    if (pq.peek() == priorities[i]) {
                        pq.poll();
                        answer++;

                        if (location == i) {
                            return answer;
                        }
                    }
                }
            }
            return answer;
        }
    }
}
