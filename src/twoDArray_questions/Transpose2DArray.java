package twoDArray_questions;

public class Transpose2DArray {


    public static void transpose2DArrayUsingExtraArray(int transpose[][]){

        int ass[][] = new int[transpose.length][transpose.length];

        for (int i = 0; i < transpose.length ; i++) {
            for (int j = 0; j < transpose.length ; j++) {
               transpose[i][j] = transpose[j][i];
            }
        }
        print2DArray(transpose);
    }

    public static void transpose2DArrayWithoutUsingExtraArray(int transpose[][]){

        for (int i = 0; i < transpose.length ; i++) {
            for (int j = i+1; j < transpose.length ; j++) {
                int temp = transpose[i][j];
                transpose[i][j] = transpose[j][i];
                transpose[j][i] = temp;
            }
        }
        print2DArray(transpose);

    }


    public static void print2DArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void main() {

        int transpose[][] =
                {{1,2,3},
                {4,5,6},
                {7,8,9}};

//        transpose2DArrayWithoutUsingExtraArray(transpose);
//        transpose2DArrayUsingExtraArray(transpose);

    }
}
