package array_questions;
/*
Given an unsorted array of integers containing numbers from 1 to n, some numbers are missing from the sequence.
formula  n(n+1/2) for the actual sum find the difference ahd subtract that to find the and..
 */
public class MissingNumber {

    // Time Complexity: O(n), Space Complexity: O(n)
    public static int findMissing(int[] arr, int n) {

        // Expected sum from 1 to n
        int expectedSum = n * (n + 1) / 2;
        // Actual array sum
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        // Missing number
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 4,6};
        int n = 6;

        System.out.println(findMissing(arr, n));
    }
}