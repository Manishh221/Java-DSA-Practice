package linkedList_questions;
import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

public class FindNthNodeFromTheEnd {

    /*
* find the nth node from the end of the linked-list here head is given in the parameter:
Is there any efficient way, provided that the given node is not the last node?

* formula: to find the nth node from the last (m-n+1)th node from the start:
*
* where m = total nodes:   and from last nth node = (m-n+1)th node
*
* ex: we have to find the 3rd node from the last and we have total number of nodes is 6 than
*
*  3rd Node = (6-3+1)th   m = total nodes, n = nth node from the last and + 1
*
*
*/
    public static Node findNthNodeFromEnd(Node head, int n) {

         int count = 0;
         Node temp = head;

         while (temp != null) {
             count++;
             temp = temp.next;
         }

       int nth =  count - n + 1;
       temp = head;
         for (int i = 1; i <= nth-1; i++) {
             temp = temp.next;
         }
         return temp;
    }


    public static void main(String[] args) {

        int n = 2; // find the second node form the end of the linked list and return that node

        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);

        list.display();

        Node head = list.getHeadNode();

        System.out.println(findNthNodeFromEndUsingPointers(head, n).data);
//        System.out.println(findNthNodeFromEnd(head, n).data);

    }

    /*
    * * find the nth node from the end of the linked-list in one traversal here head is given in the parameter:
    *  we will use two pointer, slow and fast pointers
    */

    public static Node findNthNodeFromEndUsingPointers(Node head, int n) {
        Node slow =  head;
        Node fast = head;

        for (int i = 1; i <=n ; i++) {
            fast = fast.next;       // here we have to set the fast pointer according to the nth node if questing is asking 3rd node from the end then fast will be fast.next.next.next
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
