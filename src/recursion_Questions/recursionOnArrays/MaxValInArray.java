package recursion_Questions.recursionOnArrays;

public class MaxValInArray {

    static int max = 0;

    public static int findMax(int[] arr, int length) {

        if (length == 0) {
            return 1;
        }

        findMax(arr, length - 1);

        if (max < arr[length - 1]) {
            max = arr[length - 1];
        }
        return max;
    }


    static void main() {

        int arr[] = {1, 3, 5, 2, 17, 34, 16};
        int length = arr.length;

        System.out.println(findMax(arr, length));

    }

}
