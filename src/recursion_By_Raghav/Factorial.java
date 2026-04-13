package recursion_By_Raghav;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(fact(3));
    }

    public static int fact(int n) {

        if (n == 0 || n==1) return 1;

        int fun = n * fact(n - 1);

        System.out.println(fun);

        return fun;
    }
}
