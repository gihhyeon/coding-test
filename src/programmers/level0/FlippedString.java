package programmers.level0;

public class FlippedString {

    public String solution(String my_string) {
        String answer = "";

        for(int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }

        return answer;
    }

}
