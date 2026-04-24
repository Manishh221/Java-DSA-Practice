package stacks_questions;

import java.util.Arrays;
import java.util.Stack;

/*
Given a sequence of numbers. Remove all the consecutive subsequences of length greater than or equal to
2 that contains the same element.

ex = [1,2, 2, 10,10,10,5,7,7] = [1,5] the element which are occuring more than one times should be removed:
     [1,2, 2, 10,10,10,5,7,7, 2] = [1,5,2]
 */
public class RemoveConsicutiveSubsequences {

    public static Stack<Integer> removeSubsequences(int arr[]) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) st.push(arr[i]);

            else if (st.peek() == arr[i] && arr[i] != arr[i + 1]) {
                st.pop();

            } else if (arr[i] == arr[i + 1]) {
                // do nothing
            }

            // check the last element is present in stack or not if present remove else add in the stack
            if (i == arr.length - 2) {
                if (st.peek() == arr[i + 1]) st.pop();
                else {
                    st.push(arr[i + 1]);
                }
            }
        }
        return st;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 10, 5, 5, 7};
        System.out.println("curr elements: " + Arrays.toString(arr));
        System.out.println("removed elements: " + removeSubsequences(arr));
    }
}
