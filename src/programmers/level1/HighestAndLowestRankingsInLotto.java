package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class HighestAndLowestRankingsInLotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winSet = new HashSet<>();

        for (int n : win_nums) {
            winSet.add(n);
        }

        int match = 0;
        int zeroCount = 0;

        for (int x : lottos) {
            if (x == 0) {
                zeroCount++;
            } else if (winSet.contains(x)) {
                match++;
            }
        }

        int[] rank = {6, 6, 5, 4, 3, 2, 1};

        int best = rank[match + zeroCount];
        int worst = rank[match];


        return new int[]{best, worst};
    }
}
