package fundamental_questions;

public class Fibbonacci {

    static void main() {

        int fib = 0;
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i <=10 ; i++) {

            fib = a+b;
            a = b;
            b = fib;

            System.out.print(fib + " ");

        }
    }
}
