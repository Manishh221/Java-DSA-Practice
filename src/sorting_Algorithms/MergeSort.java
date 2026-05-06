package sorting_Algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 6, 7, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {

        int n = arr.length;
        if (n == 1) return;
// step:01- create to new empty array size n/2 and n-n/2   --> n-n/2 handle both odd and even elements
        int a[] = new int[n / 2];
        int b[] = new int[n - n / 2];
//step:02- copy past original arr into a and b
        int idx = 0; // idx travels into original array

        for (int i = 0; i < a.length; i++) a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++) b[i] = arr[idx++];
// step:03  apply sorting on a and b
        mergeSort(a);
        mergeSort(b);
//step:04- merge a and b into original arr
        merge(arr, a, a.length, b, b.length);
    }

    public static void merge(int[] ans, int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = 0;
// merge both arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) ans[k] = nums1[i++];
            else ans[k] = nums2[j++];
            k++;
        }
// remaining nums1 elements
        while (i < m) ans[k++] = nums1[i++];
// remaining nums2 elements
        while (j < n) ans[k++] = nums2[j++];
    }
/*
    Time Complexity
    Levels spliting: log n
    At every level merging takes O(n)

So total: O(n log n)
Space Complexity
You create new arrays repeatedly: O(n)
*/

}
