package queue_questions;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fundamental_Queue_Questions {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);
       reverseQueue(queue);
        System.out.println(queue);
    }

    //Traversal in the queue
    public static void traversal(Queue<Integer> queue){
        int size = queue.size();
        for(int i = 0; i < size; i++){
            int a = queue.poll();
            System.out.println(a);
            queue.offer(a);
        }
    }

    // insert the element at idx
    public static void insertElementAtIdx(Queue<Integer> queue, int value, int idx) {
        int a = 0;
        int size = queue.size();

        for (int i = 0; i < idx; i++) {
            a = queue.poll();
            queue.offer(a);
        }
        queue.offer(value);

        for (int i = 0; i < size - idx; i++) {
            a = queue.poll();
            queue.offer(a);
        }
    }

    // peek the element at any idx
    public static void peekAtIdx(Queue<Integer> queue, int idx) {
        int a = 0;
        int size = queue.size();

        for (int i = 0; i < idx; i++) {
            a = queue.poll();
            queue.offer(a);
        }

        System.out.println(queue.peek());
        for (int i = 0; i < size - idx; i++) {
            a = queue.poll();
            queue.offer(a);
        }
    }

    // remove element at any idx
    public static void removeElementAtIdx(Queue<Integer> queue, int idx) {
        int size = queue.size();
        int a = 0;
        for (int i = 0; i < idx; i++) {
            a = queue.poll();
            queue.add(a);
        }

        queue.poll();

        for (int i = 0; i < size - idx; i++) {
            a = queue.poll();
            queue.add(a);
        }
    }
    
    // reverse the Queue
    public static void reverseQueue(Queue<Integer> queue){
        int size = queue.size();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <size; i++){
            stack.push(queue.poll());
        }

        for(int i = 0; i < size; i++){
            queue.add(stack.pop());
        }
    }
}


