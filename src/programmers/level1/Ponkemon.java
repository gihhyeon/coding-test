package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class Ponkemon {
//    public int solution(int[] nums) {
//        int answer = 0;
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int n : nums) {
//            set.add(n);
//        }
//
//        int length = nums.length / 2;
//
//        if (set.size() >= length) {
//            answer = length;
//        } else {
//            answer = set.size();
//        }
//
//        return answer;
//    }

    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() >= nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = set.size();
        }

        return answer;
    }
}
