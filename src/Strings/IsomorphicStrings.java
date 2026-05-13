package Strings;

import java.util.*;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // check s -> t
            if (map1.containsKey(ch1))
                if (map1.get(ch1) != ch2) return false;

            else map1.put(ch1, ch2);

            // check t -> s
            if (map2.containsKey(ch2)) {
                if (map2.get(ch2) != ch1) return false;

            } else map2.put(ch2, ch1);
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "paper";
        String t = "title";

        System.out.println(isIsomorphic(s, t));
    }
}