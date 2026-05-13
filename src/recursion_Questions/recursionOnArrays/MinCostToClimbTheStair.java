package recursion_Questions.recursionOnArrays;

public class MinCostToClimbTheStair {

    public static void main(String[] args) {

        int arr[] = {1,100,1,1,1,100,1,1,100,1};
        int n = arr.length;
        int start = 0;
        System.out.println(minCost(arr, n, start));
    }

    public static int minCost(int[] arr, int n, int start) {
        if (start >= n-1) return 0;
       return arr[start+2] + Math.min(minCost(arr,n,start+1),minCost(arr, n, start + 2 ));
    }
}
