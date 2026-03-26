package recursion_Questions.arraysAndString;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceOfArray {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
// Start backtracking from the beginning
        backtrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private static void backtrack(List<List<Integer>> resultSets,
                                  List<Integer> tempSet,
                                  int[] nums, int start) {
// Add the set to result set
        resultSets.add(new ArrayList<>(tempSet));
        for (int i = start; i < nums.length; i++) {
// Case of including the number
            tempSet.add(nums[i]);
// Backtrack the new subset
            backtrack(resultSets, tempSet, nums, i + 1);
// Case of net-including the number
            tempSet.remove(tempSet.size() - 1);
        }
    }

    // Calling:
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> tempSet = new ArrayList<>();
        backtrack(ans, tempSet, arr, 0);
        System.out.println(ans);
    }
}
