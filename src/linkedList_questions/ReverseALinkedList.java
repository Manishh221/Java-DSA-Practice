package linkedList_questions;


import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

// reverse a Linked-List and return a new head Node:
public class ReverseALinkedList {

    // reverse linked list using recursion: time is O(n) and space is O(n)
    public static Node reverseLinkedList(Node head) {

        if (head.next == null) {
            return head;
        }

        Node newNode = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);

        Node head = reverseList(list.getHeadNode());

        printLL(head);

    }

    // reverse the linked list without using recursion:   time complexity is O(N) ans space is O(1);
    public static Node reverseList(Node head) {

        Node curr = head;
        Node prev = null;
        Node tempHead = null;

        while (curr != null) {
            tempHead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempHead;
        }
        return prev;
    }

    public static void printLL(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
