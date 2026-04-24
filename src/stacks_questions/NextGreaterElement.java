package stacks_questions;

import java.util.Arrays;
import java.util.Stack;


// solve next greater element in O(n) time complexity;   also if we dont able to find next greater element then put -1
public class NextGreaterElement {

    // below is the array method where time complexity is O(n^2) ans space is O(1);
    public static int[] nextGreaterElement(int[] arr, int[] result) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = arr[j];
                    result[i] = max;
                    break;
                } else if (j == arr.length - 1 && max == 0 || i == arr.length - 1) result[i] = -1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 1, 8, 6, 3, 4};
        int result[] = new int[arr.length];

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(nextGreaterElement2(arr, result)));
    }

    // SOLVING NEXT GREATER ELEMENT IN O(N) time complexity ans O(N) space complexity:
    public static int[] nextGreaterElement2(int[] arr, int[] result) {

        Stack<Integer> stack = new Stack<>();
        result[arr.length - 1] = -1;
        stack.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] < stack.peek()) {
                result[i] = stack.peek();
                stack.push(arr[i]);

            } else {

                while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    result[i] = stack.peek();
                    stack.push(arr[i]);
                } else {
                    result[i] = -1;
                    stack.push(arr[i]);
                }
            }
        }
        return result;
    }
}
