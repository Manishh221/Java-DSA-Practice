package recursion_Questions.recursionOnArrays;

public class FindSumOfElement {

    static int sum =0;

    public static int findSumOfElement(int arr[], int length){

       if (length==0){
         return 1;
       }

       findSumOfElement(arr, length-1);

       sum += arr[length-1];

        return sum;
    }

    static void main() {

        int arr[] = {1, 3, 5,20,10};
        int length = arr.length;

        System.out.println(findSumOfElement(arr, length));

    }
}
