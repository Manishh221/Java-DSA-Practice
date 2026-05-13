package dynamic_programing;

public class MinCostToClimbTheStair {
    public static void main(String[] args) {

        int start = 0;
        int arr[] = {10, 15, 20};
        int n = 3;
        System.out.println(findMinCost(start, arr));

    }

    public static int findMinCost(int start, int arr[]) {
        if (start >= arr.length) return 0;

        int cost01 = arr[start] + findMinCost(start + 2, arr);
        int cost02 = findMinCost(start + 1, arr);
        return Math.min(cost01, cost02);
    }
}
