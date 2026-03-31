package dataStructureImpl.stackImpl;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

public class StackImplUsingLinkedList {

    public LinkedList list;
    public int size = 0;
    public Node top;
    public Node head;

    public StackImplUsingLinkedList() {
        list = new LinkedList();
        this.head = list.getHeadNode();
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public void push(int value) {
        Node node = new Node(value);
        if (head == null) {

            list.insertAtFirst(value);
            head = list.getHeadNode();
            top = head;
            size++;

        } else {

            list.insertAtEnd(node);
            top = list.getTailNode();
            size++;

        }
    }

    public int peek() {
        return top.data;
    }

    public int pop() {
        if (size==0){
            System.out.println("No element in the stack: ");
            return -1;
        }
        int temp;
        if (this.size == 1) {
            temp = this.list.getHeadNode().data;
            top = list.getTailNode();
            size--;
            return temp;
        }

        temp = top.data;
        list.removeTailNode();
        top = list.getTailNode() ;
        size--;
        return temp;
    }
}
