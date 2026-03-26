package recursion_Questions;

public class FactorialUsingRecursion {


    public static int factorial(int n){

        if (n==1){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }

    static void main() {

        int fact = 4;

        System.out.println(factorial(fact));

    }
}
