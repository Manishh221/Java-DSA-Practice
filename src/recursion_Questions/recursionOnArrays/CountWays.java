package recursion_Questions.recursionOnArrays;

public class CountWays {

    // we have to count the number of ways to climb the stairs
    public static void main(String[] args) {
        int origin = 1;
        int destination = 5; // number of staires
        System.out.println(countWays(origin, destination));

    }

    public static int countWays(int origin, int destination) {
        if (origin > destination) return 0;
        if (origin == destination) return 1;

        return countWays(origin + 1, destination) + countWays(origin + 2, destination);
    }
}
