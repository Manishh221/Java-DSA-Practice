package array_questions;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};

        int a = 3;
        int b = 3;
       int ans[] = new int[a+b];
        merge( ans,arr1, 3, arr2, b);
        System.out.println(Arrays.toString(ans));
    }

    public static void merge(int[]ans,int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0,k = 0;
// merge both arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) ans[k++] = nums1[i++];
            else ans[k++] = nums2[j++];
        }
// remaining nums1 elements
        while (i < m) ans[k++] = nums1[i++];
// remaining nums2 elements
        while (j < n) ans[k++] = nums2[j++];
    }
}

