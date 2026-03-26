package recursion_Questions;

public class FibbonacciProblemUsingRecursion {

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int ans;

        int prev = fib(n - 1);
        int prevPrev = fib(n-2);
        ans = prev + prevPrev;

        return ans;
    }

    static void main() {

        int n = 5;

        System.out.println(fib(n));

    }

}
