package recursion_Questions;

public class PrintMultipleOfNumber {

    public static int printMultiple(int num, int k){

        if (k==0){
            return 0;
        }

        int val = num + printMultiple( num, k - 1);

        return val;
    }

    static void main() {

        int num = 3;
        int k = 10;

        System.out.println(printMultiple(num, k));

    }
}
