package dataStructureImpl.binarySearch;

public class BinarySearchIterativeImpl {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;
        System.out.println(binarySearch(arr, target));
    }

    public static Boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n - 1;

        while (st <= end) {

            int mid = (st + end) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return false;
    }
}
