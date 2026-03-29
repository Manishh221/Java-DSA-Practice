import dataStructureImpl.queueImpl.ArrayImplQueue;
import dataStructureImpl.queueImpl.LinkedListQueueImpl;

public class Main {

    public static void main(String[] args) {

        LinkedListQueueImpl q = new LinkedListQueueImpl();

        q.add(23);
        q.add(42);
        q.add(54);
        q.add(65);

        q.remove();
        q.display();

        System.out.println();

        System.out.println(q.peek());
        System.out.println(q.peek());
    }
}
