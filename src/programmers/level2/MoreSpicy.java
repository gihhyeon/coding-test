package programmers.level2;

import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        int mix = 0;
        int newMin = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : scoville) {
            pq.add(n);
        }

        while (!(pq.peek() >= K) && pq.size() >= 2) {
            mix = pq.poll() + pq.poll() * 2;
            pq.add(mix);
            answer++;
        }

        if (pq.peek() >= K) {
            return answer;
        } else {
            return -1;
        }
    }
}
