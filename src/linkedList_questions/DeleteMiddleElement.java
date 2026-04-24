package linkedList_questions;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

public class DeleteMiddleElement {

    // taking middle left element:

    public static Node deleteMiddleNode(Node head) {

        if (head == null || head.next == null)
            return null;

        Node slow = head;
        Node fast = head;

        while (fast.next.next != null && fast.next.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;
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

        list.display();
        deleteMiddleNode(list.getHeadNode());
        list.display();
    }
}