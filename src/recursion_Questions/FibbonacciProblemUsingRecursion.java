package recursion_Questions;

public class FibbonacciProblemUsingRecursion {

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int ans;

        int prev = fib(n - 1);
        int prevPrev = fib(n - 2);
        ans = prev + prevPrev;

        return ans;
    }

    public static void main(String[] args) {

        int n = 7;

        System.out.println(fib(n));

    }
}
