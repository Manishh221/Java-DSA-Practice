package linkedList_questions;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

public class DetectNodeOfTheCycle {


    /*
    return the node where the cycle starts
     */

    public static Node  detectNodeInACycle(Node head) {
        Node slow = head;
        Node fast = head;

     return null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);

        Node head = list.getHeadNode();

        list.insertAtEnd(head.next.next.next);
    }

}
