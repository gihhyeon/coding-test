package programmers.level0;

public class RemainderWhenDivided9 {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;

        String[] num_list = number.split("");
        for (int i = 0; i < num_list.length; i++) {
            sum += Integer.parseInt(num_list[i]);
        }

        answer = sum % 9;

        return answer;
    }
}
