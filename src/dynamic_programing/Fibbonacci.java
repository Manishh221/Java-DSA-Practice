package dynamic_programing;

import java.util.Arrays;

public class Fibbonacci {

    public static void main(String[] args) {
        int n = 8;
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        System.out.println(fib(n, arr));
    }

    // top down DP is called as Memoization DP
    // time complexity is: O(N) and space is: O(N) + O(N) = O(N)
    public static int fib(int n, int[] arr){
    if (n==1 || n==0) return n;
    if (arr[n] !=-1) return arr[n];
    int ans = fib(n-1,arr) +  fib(n-2,arr);
    if (arr[n]==-1) arr[n] = ans;
    return ans;
    }
}
