package sorting_Algorithms;

import java.util.Arrays;


// bubble sort algorithm....
public class BubbleSortAlgo {

    /*
    for the wrost case, best case and average case the time complexity will be (n^2)
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    /*
    optimise the bubble sort in the nearly sorted arrya:
    */
    public static void optimisedApproachForBubbleSort(int[] arr) {

        Boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            flag = false;  // has only swaping happen

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }

            if (!flag){   // have any swap happen:
                break;
            }
        }
        printArray(arr);

    }

    public static void main(String[] args) {

        int arr[] = {1, 5, 3, 7, 4, 9, 5, 6};

//        optimisedApproachForBubbleSort(arr);
 bubbleSort(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
