package dataStructureImpl.queueImpl;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

public class LinkedListQueueImpl {

   public Node head;
   public Node tail;
   public int size;

    public void add(int data) {
        Node node = new Node(data);
        if (size == 0) {
            head = node;
            tail = node;
            size++;
        } else {
            tail.next = node;
            tail = tail.next;
            size++;
        }
    }

    public int remove() {
        int val;
        if (size == 0) {
            return -1;
        }
            val = head.data;
            head = head.next;
            size--;

        return val;
    }

    public int peek() {
        if (size == 0) {
            return -1;
        }
        return head.data;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

