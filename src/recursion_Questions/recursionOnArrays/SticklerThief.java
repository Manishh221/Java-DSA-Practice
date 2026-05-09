package recursion_Questions.recursionOnArrays;

/*
Stickler the thief wants to loot money from the houses arranged in a line. He cannot loot two consecutive houses and aims to maximize his total loot.
Given an array, arr[] where arr[i] represents the amount of money in the i-th house. Determine the maximum amount he can loot.

Examples:

Input: arr[] = [6, 7, 1, 3, 8, 2, 4]
Output: 19
Explanation: Maximum amount he can get by looting 1st, 3rd, 5th and 7th house, which is 6 + 1 + 8 + 4 = 19.
 */
public class SticklerThief {
    public static void main(String[] args) {
        int arr[] = {6, 7, 1, 3, 8, 2, 4};
        System.out.println(loot(0,arr));
    }

    private static int loot(int i, int[] arr) {
        if (i>=arr.length) return 0;
        int pick = arr[i] + loot(i+2, arr);
        int skip =  loot(i+1, arr);
        return Math.max(pick, skip);
    }
}
