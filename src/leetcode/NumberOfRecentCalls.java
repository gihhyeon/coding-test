package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfRecentCalls {

    Deque<Integer> queue;

    public NumberOfRecentCalls() {
        this.queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.addLast(t);

        while (!queue.isEmpty() && queue.peekFirst() < t - 3000) {
            queue.pollFirst();
        }

        return queue.size();
    }
}
