package dataStructureImpl.linkedListImpl;

public class LinkedList {

   public Node head;
   public Node tail;
   public int size = 0;


    // display Linked-List
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // insert data at end of the Linked-List;
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    // insert node at end of the Linked-List;
    public void insertAtEnd(Node node) {

        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public Node removeTailNode(){
        Node temp = head;
        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return temp;

        }

        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
        return temp;
    }

    // insert element at any index
    public void insertAtidx(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        Node temp02 = temp.next;
        temp.next = newNode;
        newNode.next = temp02;
        size++;
    }

    // insert at first of the linked-List
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    // delete at any idx
    public void deleteAtIdx(int idx) {
        Node temp = head;
        if (head != null) {
            if (idx == 0) {
                head = head.next;
                size--;
            }
            if (idx == 1) {
                temp.next = temp.next.next;
                size--;
            } else {
                for (int i = 1; i < idx; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }
    }

    // get head data
    public int getHead() {
        return head.data;
    }

    // get head node
    public Node getHeadNode() {
        return this.head;
    }

    // set head
    public void setHead(Node head) {
        this.head = head;
    }

    // get tail data
    public int getTail() {
        return tail.data;
    }

    // get tail node
    public Node getTailNode(){
        return this.tail;
    }

    // insert node at the end:
    public Node insertNodeAtTail(int data){
        Node newNode = new Node(data);
        tail.next = newNode;
        tail.next = tail;
        return tail;
    }

    public void setTailNode(Node tail) {
        this.tail = tail;
    }

    // check the value is pointing to head or not
    public boolean isHead(int val) {
        if (head != null) {
            return head.data == val;
        }
        return false;
    }

    //    check if the tail is pointing to the value or not
    public boolean isTail(int val) {
        if (tail != null) {
            return tail.data == val;
        }
        return false;
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
