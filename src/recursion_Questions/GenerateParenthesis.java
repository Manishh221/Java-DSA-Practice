package recursion_Questions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {

        int n = 3;
        int leftCount = 0;
        int rightCount = 0;
        List<String> list = new ArrayList<>();
        generateParenthesis(n, leftCount, rightCount, "", list);
        System.out.println(list);
    }

    private static void generateParenthesis(int n, int leftCount, int rightCount, String ans, List<String> ansList) {
        if (rightCount > leftCount) {
            return;
        }
        if (leftCount > n) {
            return;
        }

        if (leftCount == n && rightCount == n) {
            ansList.add(ans);
        }

       generateParenthesis(n, leftCount + 1, rightCount, ans + "(", ansList);
        generateParenthesis(n, leftCount, rightCount + 1, ans + ")", ansList);
    }
}
