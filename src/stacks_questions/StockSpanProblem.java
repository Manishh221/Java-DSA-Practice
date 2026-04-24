package stacks_questions;

import java.util.Arrays;
import java.util.Stack;

/*
The span of the stock's price in one day is the maximum number of consecutive days (starting from that day and going backward) for which the stock price was less than or equal to the price of that day.

For example, if the prices of the stock in the last four days is [7,2,1,2] and the price of the stock today is 2, then the span of today is 4 because starting from today, the price of the stock was less than or equal 2 for 4 consecutive days.
Also, if the prices of the stock in the last four days is [7,34,1,2] and the price of the stock today is 8, then the span of today is 3 because starting from today, the price of the stock was less than or equal 8 for 3 consecutive days.

Span = Aaj se peeche kitne consecutive days
       ka price aaj ke price se CHHOTA ya EQUAL hai
       (aaj ka din bhi count hoga)
 */

public class StockSpanProblem {

    // time complexity is O(n) space complexity is O(n)
    public static void stockSpanProblem(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int result[] = new int[arr.length];
        result[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = 1;    // no greater element is found;
            } else {
                result[i] = i - st.peek();
            }
            st.push(i);
        }
        printArr(result);
    }

    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 70, 80};
        printArr(arr);
        System.out.println();
        stockSpanProblem(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
