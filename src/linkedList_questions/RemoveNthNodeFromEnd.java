package linkedList_questions;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

public class RemoveNthNodeFromEnd {
    /*
    remove Nth node from the end of the linkedList using slow and fast pointers
     */
    public static Node removeNthNodeFromEndUsingPointers(Node head, int n) {

        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n ; i++) {
            fast = fast.next;
        }
        if (fast==null) {   // if we have to delete nth node and that node is equal to the size of the list then that node will be head to delete head that is the check.
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {

        int n = 2;

        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);

        list.display();

      Node head = list.getHeadNode();
      Node newHead =  removeNthNodeFromEndUsingPointers(head, 1);
      list.setHead(newHead);
      list.display();

    }
}
