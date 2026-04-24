package array_questions;

import java.util.Arrays;
import java.util.Scanner;


/*note for 2D array l1,r1 should be alwaye < l2 r2.
* for one d array l1 < r1 always.
* */


public class PrefixSumProblems {

//    Check if we can partition the array into two subarrays with equal sum. More formally,
//    check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array
public static boolean twoSubArrayWithEqualSum(int arr[]){
    int prefix[] = prefixSumUsingExtraArray(arr);
    int suffix[] = suffixSum(arr);

    for (int i = 0; i < prefix.length-1; i++) {
        if (prefix[i]==suffix[i+1]){
            return true;
        }
    }
    return false;
}

    public static int [] suffixSum(int arr[]){

        int suffix[] = new int[arr.length];
        int sum = 0;

        for (int i = arr.length-1; i >=0; i--) {
            sum+=arr[i];
            suffix[i] = sum;
        }
        return suffix;
    }

//    multiple queries in range using single travelsel find the sum, and problem based on 1 based indexing:
    public static void findSumInRangeUsing(int arr[]){

        int ans[] = prefixSumWithoutUsingExtraArray(arr);
        System.out.println("prefix Sum is: " + Arrays.toString(ans));
        Scanner sc = new Scanner(System.in);
        int l;
        int r;

        System.out.println("enter the numbers of queries: ");
        int queries = sc.nextInt();
        int sum = 0;

        while (queries-- > 0){

            System.out.println("enter the starting idx: ");
            l = sc.nextInt();
            System.out.println("enter the last idx: ");
            r = sc.nextInt();

            sum = ans[r] - ans[l-1];
            System.out.println("total sum between range: " + l + " and " + r + " is " + sum);
        }
    }

//// Given an integer array 'a', return the prefix sum/running sum in the same
//// array without creating a new array.
    public static int[] prefixSumWithoutUsingExtraArray(int arr[]){

        for (int i = 1; i < arr.length ; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    // Given an integer array 'a', return the prefix sum/running sum in the same
    // array with creating a new array.
    public static int[] prefixSumUsingExtraArray(int arr[]){

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }

   public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};
        int rangeArr[] = {0,1,2,3,4,5,6};

        System.out.println(twoSubArrayWithEqualSum(arr));

    }
}
