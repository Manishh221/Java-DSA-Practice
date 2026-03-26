package twoDArray_questions;

public class AdditionOfTwoMatrixes {

    static void main() {

        int arr1[][] = {{1,2,3}, {4,5,6}};
        int arr2[][] = {{7,8,9}, {10,11,12}};
        int ans[][] = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length ; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < ans.length ; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }

            System.out.println();
        }

    }

}
