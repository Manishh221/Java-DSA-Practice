package sorting_Algorithms;

public class InsertionSort {


    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) { // starting the i loop from the 1 because we assume the first element is the part of sorted list;
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    printArray(arr);
}

public static void main(String[] args) {

    int arr[] = {1, 9, 2, 6, 4, 8};
    insertionSort(arr);

}

public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
