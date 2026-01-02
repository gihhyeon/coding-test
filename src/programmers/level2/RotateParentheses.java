package programmers.level2;

import java.util.Stack;

public class RotateParentheses {
    public int solution(String s) {
        int answer = 0;

        for (int x = 0; x < s.length(); x++) {
            String rotated = s.substring(x) + s.substring(0, x);
            if (isValid(rotated)) {
                answer++;
            }
        }
        return answer;
    }

    boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
