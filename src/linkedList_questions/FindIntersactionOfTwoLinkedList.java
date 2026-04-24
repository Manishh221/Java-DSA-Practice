package linkedList_questions;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

public class FindIntersactionOfTwoLinkedList {

/* find out the node in witch two list are intersecting each other and return the list:

    steps: first find the length of the both the list;
           second then is l1 is greater then move the l1 head with the dif value or same if l2 is greater then move l2 with dif value
           run a while loop with two pointers and check where the node is equal and return the node:
 */

    public static Node findIntersactionOfTwoLinkedList(Node head1, Node head2) {

        Node tempNode01 = head1;
        Node tempNode02 = head2;
        int l1Length = 0;
        int l2Length = 0;

        while (tempNode01.next != null) {
            l1Length++;
            tempNode01 = tempNode01.next;
        }
        while (tempNode02.next != null) {
            l2Length++;
            tempNode02 = tempNode02.next;
        }
        tempNode01 = head1;
        tempNode02 = head2;

        if (l1Length > l2Length) {
            int tempLength = l1Length - l2Length;
            for (int i = 1; i <= tempLength; i++) {
                tempNode01 = tempNode01.next;
            }
        } else if (l2Length > l1Length) {
            int tempLength = l2Length - l1Length;
            for (int i = 1; i <= tempLength; i++) {
                tempNode02 = tempNode02.next;
            }
        }
        while (!tempNode01.equals(tempNode02)) {
            tempNode01 = tempNode01.next;
            tempNode02 = tempNode02.next;
        }
        return tempNode02;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.display();
        Node l1Head = list.getHeadNode();
        LinkedList list2 = new LinkedList();
        list2.insertAtEnd(8);
        list2.insertAtEnd(9);
        list2.insertAtEnd(l1Head.next.next.next.next);
        Node l2Head = list2.getHeadNode();
        list2.display();
        System.out.println(findIntersactionOfTwoLinkedList(l1Head, l2Head).data);
    }
}
