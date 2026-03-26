package dsaPractise;

public class p2 {


    public static int count(int n) {

        if (n==0){
            return 0;
        }
        System.out.println(n);

        System.out.println(count(n-1));

        return n;
    }


    public static void main(String[] args) {

        int n = 5;

        count(n);

    }
}
