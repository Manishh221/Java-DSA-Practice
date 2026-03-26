package dataStructureImpl.stackImpl;

public class LinkedListStack {

    public Node head;
    public Node tail;
    public int size;


    public void display() {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public int peek() {
        return tail.data;
    }

    public int pop() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int val = temp.next.data;
        tail = temp;
        tail.next = null;
        size--;
        return val ;
    }
}
