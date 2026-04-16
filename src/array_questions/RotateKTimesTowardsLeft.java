package array_questions;

import java.util.Arrays;

public class RotateKTimesTowardsLeft {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 2;
        int a = 0;
        int length = arr.length - 1;
        k = k % length;

        System.out.println(Arrays.toString(rotateKTimesTowardsLeft(arr, a, length, k)));
    }

    public static int[] rotateKTimesTowardsLeft(int[] arr, int a, int length, int k) {

        arr = reverseArray(arr, a, k-1);
        arr = reverseArray(arr, a + k, length);
        arr = reverseArray(arr, a , length);

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

