package stacks_questions.minStackWithoutUsingExtraStack;

import java.util.Stack;

public class MinStack02 {

    Stack<Integer> stack = new Stack<>(); // extra space is taking O(N)
    int min = Integer.MAX_VALUE;

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);           // direct push
            min = val;                 // initialize min
        } else {
            if (val >= min) {          // FIX 1: >= instead of >
                stack.push(val);       // normal push
            } else {
                stack.push(2*val - min); // encoded value (always < min)
                min = val;             // update min
            }
        }
    }

    public int pop() {
        if (stack.peek() >= min) {     // normal element
            return stack.pop();        // return as-is
        } else {
            int prevMin = min;         // FIX 2: save current min to return
            min = 2 * min - stack.peek(); // restore previous min
            stack.pop();               // remove encoded value
            return prevMin;            // return actual popped value
        }
    }

    public int peek() {
        if (stack.peek() >= min) {     // FIX 3: >= instead of >
            return stack.peek();
        } else {
            return min;                // encoded value — actual top is min
        }
    }

    public int getMin() {
        return min;
    }

    public void display() {
        System.out.println(stack);
    }
}

