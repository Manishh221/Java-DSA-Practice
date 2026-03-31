package stacks_questions.minStackWithoutUsingExtraStack;

import stacks_questions.minStackImplUsingExtraSpace.MinStack;

public class Main {

    public static void main(String[] args) {
        MinStack02 ms = new MinStack02();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(0);
        ms.push(-3);
        ms.push(-4);
        ms.push(-3);

        System.out.println(ms.pop());
        System.out.println(ms.getMin());
        System.out.println(ms.peek());
        ms.display();
    }
}
