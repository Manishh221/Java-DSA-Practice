package recursion_Questions.recursionOnArrays;

public class SearchTarget {

    static boolean flag = false;

    public static Boolean findTarget(int[] arr, int idx, int x) {

        if (idx == arr.length) {
            return flag;
        }

        findTarget(arr, idx + 1, x);

        System.out.println(arr[idx]);

          if (arr[idx]==x){
              flag = true;
          }

          return flag;
    }


    static void main() {

        int arr[] = {1, 3, 5, 2, 34, 16, 17};
        int idx = 0;
        int x = 17;

        System.out.println(findTarget(arr, idx, x));

    }
}
