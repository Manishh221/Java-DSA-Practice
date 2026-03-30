package linkedList_questions;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

/*
Given a linked list, split it into two lists such that one contains odd values, while the other contains even values.
 */
public class SplitLLIntoTwoList {

    public static void splitLL(Node head) {

        Node temp = head;
        Node evenHead = new Node(-1);
        Node oddHead = new Node(-1);
        Node odd = oddHead;
        Node even = evenHead;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                even.next = temp;
                even = even.next;

            } else {
                odd.next = temp;
                odd = odd.next;

            }
            temp = temp.next;
        }

        odd.next = even.next = null;

        printLL(evenHead.next);
        System.out.println();
        printLL(oddHead.next);
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);

        splitLL(list.getHeadNode());

    }

    public static void printLL(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
