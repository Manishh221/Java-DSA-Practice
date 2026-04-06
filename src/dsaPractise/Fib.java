package dsaPractise;

public class Fib {

    public static int fib(int n) {

        if (n == 1) return n;
        if (n <= 0) return n;

        int a = fib(n - 1);
        int b = fib(n - 2);
        System.out.println(a+b);
        return a + b;
    }

    public static void main(String[] args) {

       fib(5);
    }
}
