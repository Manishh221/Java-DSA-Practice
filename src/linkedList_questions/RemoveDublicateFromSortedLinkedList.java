package linkedList_questions;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;


public class RemoveDublicateFromSortedLinkedList {
    /* remove dublicate from the sorted linked list:
       ex:  1 -> 1 -> 2 -> 3 -> 3 -> 3 -> 4 -> 4 -> 5 -> 1 -> 1 -> null to 1 ->  2 -> 3 -> 4 -> 5 -> 1 -> null
     */
    public static void removeDublicate(Node head) {
        Node temp = head;
        Node slow = head.next;

        while (slow != null) {

            if (temp.data == slow.data) {
                slow = slow.next;

            } else {
                temp.next = slow;
                temp = slow;
                slow = slow.next;
            }

            if (slow == null) {
                temp.next = null;
            }
        }

        printLL(head);

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(2);
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        list.insertAtEnd(6);
        list.insertAtEnd(6);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        list.insertAtEnd(8);
        list.insertAtEnd(8);


        removeDublicate(list.head);
    }

    public static void printLL(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
