package twoDArray_questions;

public class PasclesTriangle {

    public static void print2DArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int n = 5;
//        we can initiate array with declaring column length. we will create new array as column inside loop:
        int arr[][] = new int[n][];
        for (int i = 0; i < arr.length ; i++) {
//            creating jaged array because columns are changing in every row:
            arr[i] = new int[i+1];
//            1st and last element of every row is one:
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        print2DArray(arr);
    }
}
