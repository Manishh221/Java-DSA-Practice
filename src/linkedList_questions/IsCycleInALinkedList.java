package linkedList_questions;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

public class IsCycleInALinkedList {

    /*
    find the cycle in the linked list return true or false is there any cycle or not.
     */
    public static Boolean isCycleInALinkedList(Node head) {

        Node slow =  head;
        Node fast = head;


        if (slow.next == null || head == null) {
            return false;
        }
       while(fast!=null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow==fast){
               return true;
           }
       }
        return false;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
//        list.insertAtEnd(8);

        Node head = list.getHeadNode();

        list.insertAtEnd(head.next.next.next);

        System.out.println(isCycleInALinkedList(head));

    }
}
