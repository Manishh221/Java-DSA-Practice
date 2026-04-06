package dsaPractise;

import java.util.ArrayList;

public class subSet {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> al = new ArrayList<>();

        System.out.println(sub(s, "", al));
    }

    public static ArrayList<String> sub(String s, String a, ArrayList<String> al){

        if (s.length()==0){
           al.add(a);
           return al;
        }

        char c = s.charAt(0);
       al = sub(s.substring(1), a + c, al);

       al = sub(s.substring(1), a, al);
       return al;
    }
}
