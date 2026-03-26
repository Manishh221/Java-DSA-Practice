package recursion_Questions;

public class PrintIncreasing {

    //    print 10 to 1 using recursion:
    public static void printNumReverse(int n){

        if (n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNumReverse(n-1);

    }


//    print 1 to 10 using recursion:
    public static void printNum(int n){

        if (n==1) {
            System.out.println(n);
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }

    static void main() {

        int n = 10;
      printNumReverse(n);

    }
}
