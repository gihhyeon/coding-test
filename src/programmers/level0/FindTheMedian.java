package programmers.level0;

import java.util.Arrays;

public class FindTheMedian {
    class Solution {
        public int solution(int[] array) {

            Arrays.sort(array);

            int answer = array[array.length / 2];

            return answer;
        }
    }
}
