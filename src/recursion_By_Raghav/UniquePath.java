package recursion_By_Raghav;

public class UniquePath {
    // we can go only down and right:
    public static void main(String[] args) {

//        System.out.println(uniquePath(1, 3, 1, 3));
        waysOfuniquePath(1, 3, 1, 3, "");
    }

//    finding the number of Unique path:
    public static int uniquePath(int sr, int er, int sc, int ec) {
        if (sr > er || sc > ec) {
            return 0;
        }
        if (sr == er || sc == ec) {
            return 1;
        }
        return uniquePath(sr, er, sc + 1, ec) + uniquePath(sr + 1, er, sc, ec);
    }

    // printing the Unique ways of the path
    public static void waysOfuniquePath(int sr, int er, int sc, int ec, String ans) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(ans);
            return;
        }
        waysOfuniquePath(sr, er, sc + 1, ec, ans + 'R');
        waysOfuniquePath(sr + 1, er, sc, ec, ans + 'D');
    }
}
