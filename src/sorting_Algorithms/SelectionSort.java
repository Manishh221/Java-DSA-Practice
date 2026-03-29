package sorting_Algorithms;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;                          // track index, not value

            for (int j = i + 1; j < arr.length; j++) { // start j at i+1
                if (arr[j] < arr[minIndex]) {           // find smallest
                    minIndex = j;
                }
            }

            // swap only if a smaller element was found
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 7};
        selectionSort(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
