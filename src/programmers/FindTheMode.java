package programmers;

public class FindTheMode {
    public int solution(int[] array) {
        int[] count = new int[1000]; // 등장 횟수를 저장할 배열 count

        int answer = 0; // 최빈값
        int maxCount = 0; // 제일 많이 나온 횟수

        // array의 모든 원소에 대해 등장 횟수를 count 배열에 누적
        // 배열의 각 원소를 num 변수에 하나씩 대입
        for (int num : array) {
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                answer = i; // 가장 많이 등장한 숫자 i를 answer로 저장
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount && i != answer) {
                return -1;
            }
        }

        return answer;
    }

}
