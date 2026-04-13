package recursion_By_Raghav;

public class ReverseDigit {
    public static void main(String[] args) {
        int n = 1234;
        int ans = 0;
        revDigit(n, ans);
    }

    public static void revDigit(int n, int ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        int digit = n % 10;
        ans = ans * 10 + digit;

        revDigit(n / 10, ans);   // time complexity   O(long10 N) ~ O(1)
    }
}
