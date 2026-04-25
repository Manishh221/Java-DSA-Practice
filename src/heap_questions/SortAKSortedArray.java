package heap_questions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortAKSortedArray {

    public static void main(String[] args) {

        int arr[] = {6, 5, 3, 2, 8, 10, 9, 2};
        int k = 3;
        int count = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int element : arr) {
            pq.add(element);
            if (pq.size() > k) {
               arr[count] = pq.remove();
               count++;
            }
        }
       while(!pq.isEmpty()) {
            arr[count] = pq.remove();
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
