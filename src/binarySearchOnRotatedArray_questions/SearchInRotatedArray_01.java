package binarySearchOnRotatedArray_questions;

public class SearchInRotatedArray_01 {

    // find minimum element using binary search:
    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 6, 7, 1, 2};

        System.out.println(findMimElement(arr));
    }

    public static int findMimElement(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int minEle = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] < minEle) {
                minEle = arr[mid];

            } else if (arr[mid] < arr[end]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return minEle;
    }
}
