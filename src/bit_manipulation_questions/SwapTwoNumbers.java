package bit_manipulation_questions;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;

        a = a^b;
        b = a^b;
        a = a^b;


        System.out.println("a: " + a + ", b: " + b);

    }
}
