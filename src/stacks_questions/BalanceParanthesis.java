package stacks_questions;

import java.util.Stack;

public class BalanceParanthesis {


    public static Boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                stack.push('(');
            }  else if (stack.peek() == '(' && str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return Boolean.FALSE;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String str ="((()()))";

        if (str.length()%2==1){
            System.out.println(Boolean.FALSE);
            return;
        }

        System.out.println(isBalanced(str));

    }
}
