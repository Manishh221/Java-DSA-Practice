package queue_questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsInAQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);
        int k = 3;

        System.out.println(queue);
        reverseFirstKElements(queue, k);
        System.out.println(queue);
    }


    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        int size = queue.size();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        for (int i = 0; i < size - k; i++) {
            queue.offer(queue.poll());
        }

    }
}
