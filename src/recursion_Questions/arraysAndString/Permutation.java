package recursion_Questions.arraysAndString;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String s = "ABC";
        List<String> al = new ArrayList<>();
        permutation(s, "", al);
        System.out.println(al);
    }

    private static void permutation(String s, String s1, List<String> al) {
        if (s.length() == 0) {
            al.add(s1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            String rem = left + right;
            permutation(rem, s1 + ch, al);
        }
    }
}
