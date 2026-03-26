package recursion_Questions;

public class SumOfNaturalNumberAlternateSign {

    public static int sumOfNaturalNumberAlternateSign (int n) {

        if(n==0){
            return 0;
        }

        int sum = sumOfNaturalNumberAlternateSign(n-1);

        if(n%2==0){
            return sum - n;
        }else{
            return sum + n;
        }
    }

    static void main() {

        int n = 10;
        System.out.println(sumOfNaturalNumberAlternateSign(n));

    }
}
