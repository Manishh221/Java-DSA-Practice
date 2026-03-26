package linkedList_questions;

import dataStructureImpl.linkedListImpl.LinkedList;
import dataStructureImpl.linkedListImpl.Node;

//   leet code 237:

public class DeleteNodeItSelf {


    /*
   so, in this question the node will be provided itself that we have to delete that node.
   but here we are not deleting the node we are assigning the next node value to the deleted node and
   deleted node pointing to the node.next.next node

   note: if we have to delete the last node then this will not work:
    */
    public static void deleteNodeItSelf(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

//        deleteNodeItSelf(list.getHeadNode().next.next);
        list.display();
        System.out.println(list.removeTailNode().data);
        list.display();
        System.out.println(list.getTail());

    }
}
