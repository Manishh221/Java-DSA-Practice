package recursion_Questions.recursionOnArrays;

public class FindAllTheIdxOfIntegerX {

    public static void findAllTheIdxOfIntegerX(int[] arr, int idx, int x) {

        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == x) {
            System.out.print(idx + " ");
        }
        findAllTheIdxOfIntegerX(arr, idx + 1, x);


    }


    static void main() {

        int arr[] = {5, 3, 5, 2, 5, 16, 5};
        int idx = 0;
        int x = 5;

        findAllTheIdxOfIntegerX(arr, idx, x);

    }


}
