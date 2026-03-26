package recursion_Questions;

public class FindPowPndQ {


    public static int findPowPndQ(int p, int q){

        if (q==0){
            return 1;
        }

        return 2 * findPowPndQ(p, q-1);
    }

    static void main() {

        int p = 2;
        int q = 3;
        int total = 1;

        System.out.println(findPowPndQ(p,q));
    }
}
