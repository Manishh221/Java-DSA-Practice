package recursion_Questions;

public class SumOfDigits {

    static int sum = 0;

    public static int sunOfDigit(int n) {

        if (n == 0)
            return 0;

        sunOfDigit(n / 10);

        sum += n % 10;

        return sum;
    }

    static void main() {

        int n = 1234;

        System.out.println(sunOfDigit(n));

    }
}
