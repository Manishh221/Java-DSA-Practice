package linkedList_questions;


import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

// two sorted linked list head is given and make single linked list by merging them:
public class MergeTwoSortedLinkedList {

    // merge two sorted list using Extra space:
    public static Node mergeTwoSortedListUsingExtraSpace(Node head1, Node head2) {
        Node tempA = head1;
        Node tempB = head2;
        Node newNode = new Node(10);
        Node ansNode = newNode;

        while (tempB != null && tempA != null) {
            if (tempA.data > tempB.data) {
                Node n = new Node(tempB.data);
                ansNode.next = n;
                ansNode = n;
                tempB = tempB.next;

            } else {
                Node n = new Node(tempA.data);
                ansNode.next = n;
                ansNode = n;
                tempA = tempA.next;
            }
        }

        if (tempA != null) {
            ansNode.next = tempA;
        } else {
            ansNode.next = tempB;
        }

        newNode = newNode.next;
        return newNode;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(6);
        list.insertAtEnd(8);

        LinkedList list2 = new LinkedList();
        list2.insertAtEnd(1);
        list2.insertAtEnd(3);
        list2.insertAtEnd(5);
        list2.insertAtEnd(7);

        Node head = mergeTwoSortedListWithoutUsingExtraSpace(list.getHeadNode(), list2.getHeadNode());

        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    public static Node mergeTwoSortedListWithoutUsingExtraSpace(Node head1, Node head2){

        Node temp1 = head1;
        Node temp2 = head2;
        Node head = new Node(0);
        Node t1 = head;

        while (temp1 != null && temp2 != null){
            if (temp1.data > temp2.data){
                t1.next = temp2;
                t1 = temp2;
                temp2 = temp2.next;
            } else {
                t1.next = temp1;
                t1 = temp1;
                temp1 = temp1.next;
            }
        }

   if(temp1 != null){
       t1.next = temp1;
   } else {
       t1.next = temp2;
   }
        return head.next;
    }
}
