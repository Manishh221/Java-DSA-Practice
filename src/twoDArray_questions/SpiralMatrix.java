package twoDArray_questions;

public class SpiralMatrix {

    public static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSpiralMatrix(int arr[][], int row, int col){

        int topRow = 0;
        int bottomRow = arr.length;
        int leftCol = 0;
        int rightCol = arr[arr.length-1].length;
        int totalElement = row * col;
        System.out.println(totalElement);
        int a = 0;

        while(a<totalElement) {
            for (int i = leftCol; i < rightCol && a<totalElement; i++) {
                System.out.print(arr[topRow][i] + " ");
                a++;
            }

            topRow++;

            for (int i = topRow; i < bottomRow && a<totalElement; i++) {
                System.out.print(arr[i][rightCol - 1] + " ");
                a++;
            }

            rightCol--;

            for (int i = rightCol - 1; i >= leftCol && a<totalElement; i--) {
                System.out.print(arr[bottomRow - 1][i] + " ");
                a++;
            }

            bottomRow--;

            for (int i = bottomRow - 1; i >= topRow && a<totalElement; i--) {
                System.out.print(arr[i][leftCol] + " ");
                a++;
            }
            leftCol++;
        }
    }

    static void main() {

        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        int rows = 4;
        int col = 4;

        printSpiralMatrix(arr, rows, col);


    }
}
