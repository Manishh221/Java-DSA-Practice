package sorting_Algorithms;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;                          // track index, not value

            for (int j = i + 1; j < arr.length; j++) { // start j at i+1
                if (arr[minIndex] > arr[j]) {           // find smallest
                    minIndex = j;
                }
            }
            // swap only if a smaller element was found
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                printArray(arr);
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = {7,5,4,1,3};
        selectionSort(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
