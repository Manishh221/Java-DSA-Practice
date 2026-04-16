package array_questions;

import java.util.Arrays;

public class RotateArrayKTimesTowardsRight {

    //    rotate array without using extra space from the back
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 0;
        int n = arr.length - 1;
        int k = 2;
        k = k % n;

        System.out.println(Arrays.toString(rotatekTimesFromTowardsRight(arr, k, a, n)));

    }

    public static int[] rotatekTimesFromTowardsRight(int[] arr, int k, int a, int n) {
        arr = reverseArray(arr, 0, n - k);
        arr = reverseArray(arr, arr.length - k, n);
        arr = reverseArray(arr, 0, n);
        return arr;
    }

    public static int[] reverseArray(int arr[], int a, int b) {
        while (a <= b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            b--;
            a++;
        }
        return arr;
    }
}
