package recursion_Questions.arraysAndString;

public class CheckPalindromicString {

    static boolean flag = true;

    public static Boolean checkPalindrom(String s,int a, int l){

        if (a>l){
          return flag;
        }

        if (s.charAt(a) != s.charAt(l)){
            flag = false;
        }

        checkPalindrom(s,a+1,l-1);

           return flag;
    }

    public static void main(String[] args) {

        String s = "ecddce";
        int a =0;
        int b = s.length()-1;
        System.out.println( checkPalindrom(s,a,b));

    }
}
