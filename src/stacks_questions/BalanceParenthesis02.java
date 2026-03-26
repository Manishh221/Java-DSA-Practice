package stacks_questions;

import java.util.Stack;

/*
Find the minimum number of brackets that we need to remove to make the given bracket sequence balanced
 */
public class BalanceParenthesis02 {

    public static int needTORemoveNumberOfParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));

            }  else if (str.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    continue;
                }
                num++;
            }
        }
        return stack.size() + num;
    }

    public static void main(String[] args) {

        String str =")())()))";

        System.out.println(needTORemoveNumberOfParenthesis(str));

    }
}
