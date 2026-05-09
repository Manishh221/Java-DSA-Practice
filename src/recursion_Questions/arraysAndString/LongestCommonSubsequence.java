package recursion_Questions.arraysAndString;

public class LongestCommonSubsequence {
    public static void main(String[] args) {

        System.out.println(lcs("abc", "ac", 0,0));
    }

    public static int lcs(String s1, String s2, int i, int j) {

        if (i == s1.length() || j == s2.length()) return 0;
        // match
        if (s1.charAt(i) == s2.charAt(j)) {
            return 1 + lcs(s1, s2, i + 1, j + 1);
        }
        // mismatch
        return Math.max(lcs(s1, s2, i + 1, j), lcs(s1, s2, i, j + 1));
    }
}
