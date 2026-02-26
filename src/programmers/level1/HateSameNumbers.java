package programmers.level1;

import java.util.Stack;

public class HateSameNumbers {
//    public Stack solution(int []arr) {
//
//        Stack<Integer> stack = new Stack<Integer>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (stack.isEmpty() || stack.peek() != arr[i]) {
//                stack.push(arr[i]);
//            }
//        }
//
////         int[] answer = new int[stack.size()];
//
////         for (int i = stack.size() - 1; i >= 0; i--) {
////             answer[i] = stack.pop();
////         }
//
//        return stack;
//    }

public int[] solution(int[] arr) {

    Stack<Integer> stack = new Stack<>();

    stack.push(arr[0]);

    for (int i = 1; i < arr.length; i++) {
        if (stack.peek() != arr[i]) {
            stack.push(arr[i]);
        }
    }

    int[] answer = new int[stack.size()];

    for (int i = 0; i < stack.size(); i++) {
        answer[i] = stack.get(i);
    }

    return answer;
}
}
