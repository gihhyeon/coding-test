package programmers.level1;

import java.util.HashSet;

public class Ponkemon {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int length = nums.length / 2;

        if (set.size() >= length) {
            answer = length;
        } else {
            answer = set.size();
        }

        return answer;
    }
}
