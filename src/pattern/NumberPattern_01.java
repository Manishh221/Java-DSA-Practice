package pattern;

public class NumberPattern_01 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = n + n - 1; j >= i + i - 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i + i - 1; j <= n + n-1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
