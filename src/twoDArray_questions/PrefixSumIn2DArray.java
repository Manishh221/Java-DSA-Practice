package twoDArray_questions;

import java.util.Scanner;

public class PrefixSumIn2DArray {

    public static void print2DArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] prefixSumMatrixRowAndCol(int arr[][], String columnOrRow) {

        if (columnOrRow.equals("columns")) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr[i].length; j++) {
                    arr[i][j] = arr[i][j - 1] + arr[i][j];
                }
            }

        } else if(columnOrRow.equals("rows")){
            for (int i = 1; i <arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] += arr[i-1][j];
                }
            }
            return arr;
        } else {
            System.out.println("Undefined Columns and Rows: ");
        }
        return arr;
    }

//    spproach 03 better approach for query find prefixSumOfCol than calculate pref ixSumOfRow
    public static void calculatePrefixSum03(int arr[][]){

        prefixSumMatrixRowAndCol(arr, "columns");
        print2DArray(arr);
        System.out.println();
        prefixSumMatrixRowAndCol(arr, "rows");
        print2DArray(arr);

        int l1, r1, l2, r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of queries: ");
        int queries = sc.nextInt();
        int sum = 0;

        while(queries-- > 0){

            System.out.println("enter l1 value: ");
            l1 = sc.nextInt();
            System.out.println("enter r1 value:");
            r1 = sc.nextInt();
            System.out.println("enter second l2 value: ");
            l2 = sc.nextInt();
            System.out.println("enter the second r2 value:");
            r2 = sc.nextInt();

//            ans = sum-up-left+upleft
//            sum = arr[l2][r2], up = arr[l1-1][r2], left = arr[l2][r1-1], upleft = arr[l1-1][r1-1]
            sum += arr[l2][r2] -  arr[l1-1][r2] - arr[l2][r1-1] + arr[l1-1][r1-1];

        }
        System.out.println(sum);

    }

//  02  optimised approach better than brutforce first find the all the prefix sum of every row and than minus the [i][r1-1]
    public static void prefixSumQuery02(int arr[][]){

        int l1, r1, l2, r2;
        Boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int sum = 0;

           prefixSumMatrixRowAndCol(arr, "columns");
           print2DArray(arr);

        System.out.println("enter the number of queries: ");
        int query = sc.nextInt();

        while(query-- > 0){

            System.out.println("enter l1 value: ");
            l1 = sc.nextInt();
            System.out.println("enter r1 value:");
            r1 = sc.nextInt();
            System.out.println("enter second l2 value: ");
            l2 = sc.nextInt();
            System.out.println("enter the secondd r2 value:");
            r2 = sc.nextInt();

            for (int i = l1; i <= l2; i++) {
                if (r1>=1){
                    sum += arr[i][r2] - arr[i][r1-1];
                } else {
                    sum += arr[i][r2];
                }
            }
            System.out.println("total sum is: " + sum);
        }
    }

//    01 brutforce approach
    public static void prifixSumBrutforce01(int arr[][] , int l1, int r1, int l2, int r2){

        //        note: r2, c2 should be > r1,c1
        int sum = 0;

        for (int i = l1; i <=l2 ; i++) {
            for (int j = r1; j <=r2 ; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
   public static void main(String[] args) {

        int arr[][] = {
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}};

        int l1 = 1, r1 = 3, l2 = 3, r2 = 5;
//sum += arr[l2][r2] -  arr[l1-1][r2] - arr[l2][r1-1] + arr[l1-1][r1-1];
//        prifixSumBrutforce(arr, l1,r1,l2,r2);

//        prefixSumQuery02(arr);

        calculatePrefixSum03(arr);
    }
}
