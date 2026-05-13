package queue_questions;

import java.util.LinkedList;
import java.util.Queue;

public class WinnerOfCircularGame {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        int k = 2;
        System.out.println(findWinner(queue,k));
    }

    // time complexity O(k*n), space O(n)
    public static int findWinner(Queue<Integer> queue, int k) {
        while (queue.size()!=1) {
            for (int i = 0; i < k-1; i++) {
              queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }
}
