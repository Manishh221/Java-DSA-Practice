package stacks_questions.minStackImplUsingExtraSpace;

import java.util.Stack;


// push pop peek and get element at O(N) space complexity and O(1) time complexity:
public class MinStack {

    Stack<Integer> stack = new Stack<>(); // extra space is taking O(N)
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        if (stack.isEmpty() && minStack.isEmpty()) {
            stack.push(val);
            minStack.push(val);
        } else {
            stack.push(val);
            if (val <= minStack.peek()) {
                minStack.push(val);
            } else {
                minStack.push(Math.min(minStack.peek(), val));
            }
        }

    }

    public int pop() {
        minStack.pop();
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public void display() {
        System.out.println(stack);
    }
}
