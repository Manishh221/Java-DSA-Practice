package linkedList_questions;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

public class PalindromLinkedList {

    public static Node reverseList(Node head) {

        Node curr = head;
        Node prev = null;
        Node Next = null;

        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        return prev;
    }


    public static Boolean isPalindrom(Node head) {

        Boolean flag = true;
        Node slow = head;
        Node fast = head;

        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast.next == null) {
                break;
            }
        }

        Node tempNode = reverseList(slow.next);

        Node p1 = head;
        slow.next = tempNode;
        Node p2 = slow.next;

        while (!p1.equals(slow)) {
            if (p1.data != p2.data) {
                flag = false;
                return flag;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return flag;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(6);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(2);
        list.insertAtEnd(1);
        list.insertAtEnd(8);

        System.out.println(isPalindrom(list.getHeadNode()));

    }

    public static void printLL(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}
