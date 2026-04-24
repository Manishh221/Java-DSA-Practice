package stacks_questions;

import java.util.Stack;


/*
Check whether a given bracket sequence is valid or not:

ex: {([)]} = false
    [{()()}] = true
    [(){)} = false
 */

public class BalanceBreackets {

    public static Boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else if (!stack.isEmpty()  && str.charAt(i) == ')' && stack.peek() == '(' || str.charAt(i) == '}'
                    && stack.peek() == '{' || str.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else{
                return false;
            }
        }
        System.out.println(stack);
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{(())[]}[]";
        System.out.println(isBalanced(str));
    }
}

