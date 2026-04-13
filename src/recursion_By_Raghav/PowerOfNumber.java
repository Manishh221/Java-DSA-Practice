package recursion_By_Raghav;

public class PowerOfNumber {
    public static void main(String[] args) {
        int a = 2;
        int b = 60;

        System.out.println(pow(a, b));
    }

    public static Long pow(int a, int b) {
        if (b == 0) return 1L;
        Long call = pow(a, b / 2);
        if (b % 2 == 0) {
            return call * call;
        } else {
            return a * pow(a, b - 1);
        }
    }
}
