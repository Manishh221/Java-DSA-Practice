package twoDArray_questions;

// rotate 90D towards right: ans transpose + reverse the column


public class Rotate90D {

    public static void print2Darray(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] reverseArrayColumn(int arr[]) {

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            l++;
            r--;
        }
        return arr;
    }

    public static int[][] reverseRows(int arr[][]) {

        int t = 0;
        int b = arr.length - 1;

        while (t < b) {
            int temp[] = arr[t];
            arr[t] = arr[b];
            arr[b] = temp;
            t++;
            b--;
        }
        return arr;
    }

    public static int[][] transpose(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    public static void rotate2DArray90DTowardsLeft(int arr[][]) {
        transpose(arr);
        reverseRows(arr);
        print2Darray(arr);
    }

    public static void rotate2DArray90DTowardsRight(int arr[][]) {
        transpose(arr);
        for (int i = 0; i < arr.length; i++) {
            reverseArrayColumn(arr[i]);
        }
        print2Darray(arr);
    }

   public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        rotate2DArray90DTowardsLeft(arr);

    }
}
