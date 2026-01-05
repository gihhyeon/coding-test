package programmers.level2;

import java.util.*;

public class Process {
//    class Solution {
//        public int solution(int[] priorities, int location) {
//            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//            int answer = 0;
//
//            for (int n : priorities) {
//                pq.add(n);
//            }
//
//            while (!pq.isEmpty()) {
//                for (int i = 0; i < pq.size(); i++) {
//                    if (pq.peek() == priorities[i]) {
//                        pq.poll();
//                        answer++;
//
//                        if (location == i) {
//                            return answer;
//                        }
//                    }
//                }
//            }
//            return answer;
//        }
//    }

    class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;
            Queue<Integer> queue = new LinkedList<>();

            for (int p : priorities) {
                queue.add(p);
            }

            Arrays.sort(priorities);
            int index = priorities.length - 1;

            while (!queue.isEmpty()) {
                int current = queue.poll();

                if (current == priorities[index]) {
                    answer++;
                    if (location == 0) {
                        return answer;
                    }

                    index--;
                    location--;
                } else {
                    queue.add(current);
                    if (location == 0) {
                        location = queue.size() - 1;
                    } else {
                        location--;
                    }
                }
            }
            return answer;
        }
    }
}
