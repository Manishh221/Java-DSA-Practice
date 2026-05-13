package Strings;

import java.util.HashMap;
import java.util.Map;

/*
Two strings are called anagrams if they contain the same characters with the same frequency, but possibly in a different order.
 */
public class Anagram {
// time is O(N) and space is O(K)
    public static boolean isAnagram(String s1, String s2) {

        // Step 1: length check
        if (s1.length() != s2.length()) {
            return false;
        }
        // Step 2: create hashmap
        Map<Character, Integer> map = new HashMap<>();
        // Step 3: count characters from first string
        for (char ch : s1.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        // Step 4: decrease count using second string
        for (char ch : s2.toCharArray()) {
            // character not found
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            // remove if count becomes zero
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        // Step 5: if map empty => anagram
        return map.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAnagram(s1, s2));
    }
}
