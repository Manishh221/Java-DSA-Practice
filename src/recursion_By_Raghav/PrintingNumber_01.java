package recursion_By_Raghav;

public class PrintingNumber_01 {
    public static void main(String[] args) {

        print(5);

    }

    public static void print(int n){
        if (n==0) return;
        System.out.print(n + " ");
        print(n-1);
        System.out.print(n + " ");
    }
}
