package dataStructureImpl.queueImpl;

import java.util.Arrays;

public class ArrayImplQueue {


    public int arr[] = new int[5];
    public int rear = -1;
    public int front = -1;
    public int size;

    public void add(int data) {
        if (rear == -1 && front == -1) {
            rear+=1;
            front+=1;
            arr[rear] = data;
            size++;
        } else{
            rear+=1;
            arr[rear] = data;
            size++;
        }
    }

    public int remove() {

        int val = arr[front];
        front+=1;
        size--;
        return val;
    }

    public int peek() {
       if (rear != -1 && front != -1 && front >= rear) {
           return -1;
       }
        return arr[front];
    }

    public void display() {
        if (front > rear) {
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "ArrayImplQueue{" +
                "arr=" + Arrays.toString(arr) +
                ", rear=" + rear +
                ", front=" + front +
                '}';
    }
}
