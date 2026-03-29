package dataStructureImpl.stackImpl;

public class ArrayImplStack {

    private int size;
    private int[] stack;
    private int idx = -1;

    public void push(int data) {
        if(isFull()){
            System.out.println("ArrayImplStack is full: ");
            return;
        }
        this.stack[++idx] = data;
    }

    public int peek(){
        if(idx == -1){
            System.out.println("stack is empty");
            return idx;
        }
        return stack[idx];
    }

    public int pop(){
        if(idx == -1){
            System.out.println("stack is empty");
            return idx;
        }
        int top = stack[idx--];
        stack[idx+1] = 0;
        return top;
    }

    public boolean isEmpty(){
        return idx == -1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
            this.size = size;
            this.stack = new int[size];
        }

        public Boolean isFull(){
        return idx == size - 1;
        }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}
