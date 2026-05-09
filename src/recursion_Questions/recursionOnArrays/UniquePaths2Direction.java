package recursion_Questions.recursionOnArrays;

public class UniquePaths2Direction {

    // find all the unique paths for the grid to reach to the destination: follow only down: and left:
    public static void main(String[] args) {
        int n = 2;
        int m = 2;
        int kr = 0;
        int kc = 0;
        findUniquePaths(n, m, kr, kc, "");
    }

    public static void findUniquePaths(int r, int c, int kr, int kc, String ans) {
        if (kr == r && kc == c){
            System.out.println(ans);
            return;
        }
        if (kr > r || kc > c) return;

        findUniquePaths(r, c, kr + 1, kc, ans + "D");
        findUniquePaths(r, c, kr, kc + 1, ans + "R");
    }
}
