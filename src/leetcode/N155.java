package leetcode;

import java.util.Stack;

public class N155 {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public N155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
