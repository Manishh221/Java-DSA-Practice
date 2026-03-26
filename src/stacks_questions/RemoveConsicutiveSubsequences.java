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


    public static int[] removeSubsequences(int arr[]) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length - 1; i++) {

            if (st.isEmpty() || st.peek() != arr[i]) st.push(arr[i]);

            else if (st.peek() == arr[i]) {

                if (arr[i] != arr[i + 1]) st.pop();

            } else if (arr[i] == arr[i + 1]) {
                // do nothing
            }
            if (i == arr.length - 2) {

                if (st.peek() == arr[i + 1]) st.pop();

                else {
                    st.push(arr[i + 1]);
                }
            }
        }

        int ans[] = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 2, 3, 10, 5, 5, 7};

        System.out.println(Arrays.toString(removeSubsequences(arr)));

    }
}
