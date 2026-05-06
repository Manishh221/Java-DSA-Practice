package sorting_questions;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};

        int a = arr1.length;
        int b = arr2.length;

        merge(arr1,3,arr2,b);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[m + n];

        // merge both arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                ans[k] = nums1[i];
                i++;
            } else {
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }
        // remaining nums1 elements
        while (i < m) {
            ans[k] = nums1[i];
            i++;
            k++;
        }
        // remaining nums2 elements
        while (j < n) {
            ans[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(ans));
    }}