package dataStructureImpl.binarySearch;

public class BinarySearchRecursiveImpl {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int target = 9;
        int start = 0;
        int end = n - 1;
        System.out.println(binarySearch(arr, target, start, end));
    }

    public static Boolean binarySearch(int arr[], int target, int start, int end) {
        if (start > end) {
            return false;
        }
        int mid = (start + end) / 2;

        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }

        boolean flag = binarySearch(arr, target, start, end);

        return flag;
    }
}
