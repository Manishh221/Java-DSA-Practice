package recursion_Questions;

public class GCD {

    public static int findGCDRecusion(int x, int y) {

        if (y % x == 0) {
            return x;
        }
        int a = x % y;
        x = y;
        y = a;
        return findGCDRecusion(x, y);
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 12;

        System.out.println(findGCDRecusion(x, y));
    }

    public static void GCDIterative(int x, int y) {
        int a = 0;
        while (y % x != 0) {
            a = x % y;
            x = y;
            y = a;
        }
        System.out.println(x);
    }
}
