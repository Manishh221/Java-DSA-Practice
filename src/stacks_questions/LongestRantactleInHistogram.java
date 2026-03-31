package stacks_questions;


/*
Q. Largest rectangle in Histogram
Given an array of integer heights representing the histogram's bar height where the width of each bar is 1,
 return the area of the largest rectangle in the histogram.
 */

import java.util.Arrays;
import java.util.Stack;

public class LongestRantactleInHistogram {

    //finding next smaller element:
    public static int[] NSE(int arr[]) {

        Stack<Integer> st = new Stack<>();

        int ans[] = new int[arr.length];
        st.push(arr.length - 1);
        ans[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {

                while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                           st.pop();
                }
                if (!st.isEmpty()) {
                    ans[i] = st.peek();
                    st.push(i);
                } else {
                    ans[i] = arr.length;
                    st.push(i);
                }
            }
        return ans;
    }

// finding previous smaller element:
    public static int [] PSE(int arr[]){

        Stack<Integer> st = new Stack<>();

        int ans[] = new int[arr.length];
        st.push(0);
        ans[0] = -1;

        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }

        return ans;
    }


    public static int findAreaOfRant(int height[],int[] NSE, int max, int[] PSE) {

        for (int i = 0; i < height.length; i++) {
           int area  = height[i] * (NSE[i] - PSE[i] - 1);
            max = Math.max(max,area);
        }
        return max;
    }


    public static void main(String[] args) {

        int arr[] = {2,1,5,6,2,3};
        int NSE[] = NSE(arr);
        int PSE[] = PSE(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(NSE));
//        System.out.println(Arrays.toString(PSE));
        System.out.println(findAreaOfRant(arr,NSE,-1, PSE));

    }
}
