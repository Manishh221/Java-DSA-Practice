package heap_questions;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class KthSmallestElement {

    // kth smallest element including dublicates
    public static int kthSmallestElement(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int element : arr){  // nlogK
            pq.add(element); // logK
            if (pq.size()>k) pq.remove(); // logK
        }
      return pq.peek();
    }

    // kth smallest element excluding dublicates
    public static int kthSmallestElement_02(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder(Collections.reverseOrder()));
        Set<Integer> hs = new HashSet<>();
        for(int element : arr){  // nlogK

           if (hs.add(element)){
               pq.add(element); // nlogK
           }

            if (pq.size()>k) pq.remove(); // logK
        }
      return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        System.out.println(kthSmallestElement_02(arr,k));
    }
}
