package HashMap_Questions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "azxxmxbaaabcccee";
        int min = Integer.MAX_VALUE;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
    }

