package linkedList_questions;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;


public class FindMiddleElement {

    /*
    que - find the middle node in single traversal and return the node
   1 for the even size we will consider left middle
    */

    public static Node findMiddleNode(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast.next == null) {
                return slow;
            }
        }
        return slow;
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

        System.out.println(findMiddleNode(list.getHeadNode()).data);

    }
}
