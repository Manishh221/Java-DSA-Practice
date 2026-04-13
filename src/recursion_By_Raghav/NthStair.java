package recursion_By_Raghav;

public class NthStair {

    // printing max jump at a time is two allowed:
    // finding the ways of steps:
    // printion number of ways:


    public static void main(String[] args) {
        stair(1, 0, " ");
//        System.out.println(stairWays(5, 0, 0));

    }

    // finding the ways of steps:
    public static void stair(int n, int a, String result) {
        if (a == n) {
            System.out.println(result);
            return;
        }
        if (a > n) return;

        stair(n, a + 1, result + '1' + " step ");  // one stair at a time
        stair(n, a + 2, result + '2' + " steps ");  // two stair at the time
    }


    // finding the nummber of ways:
    public static int stairWays(int n, int a, int result) {
        if (a == n) {
            return 1;
        }
        if (a > n) return 0;

        int c = stairWays(n, a + 1, result);  // one stair at a time
        int d = stairWays(n, a + 2, result);  // two stair at the time

        return c + d;
    }
}
