package binarySearchOnRotatedArray_questions;


// return the index of the target element in the rotated array:
public class SearchInRotatedArrya_02 {

    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 1, 2};
        int k = 2;
        int st = 0;
        int end = arr.length - 1;

        System.out.println(findTargetIdx(arr, st, end, k));

    }

    // find the index of the target element in binary search in O(logN);
    public static int findTargetIdx(int arr[], int start, int end, int target) {

        int mid = -1;

        while (start <= end) {

            mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] < arr[end]) {

                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {

                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return mid;
    }
}
