package recursion_Questions.recursionOnArrays;

public class PrintArray {

    public static void printElement(int arr[], int length) {

        if (length == 0) {
            return;
        }

        printElement(arr, length - 1);

        System.out.print(arr[length - 1] + " ");

    }

    static void main() {

        int arr[] = {1, 3, 5, 20, 10};
        int length = arr.length;

        printElement(arr, length);
    }
}
