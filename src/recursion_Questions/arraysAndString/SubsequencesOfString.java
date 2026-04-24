package recursion_Questions.arraysAndString;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesOfString {

    public static ArrayList<String> subsequences(String str) {
        ArrayList<String> ans = new ArrayList<>();
        if (str.length() == 0) {
            ans.add(" ");
            return ans;
        }
        char curr = str.charAt(0);
        ArrayList<String> small = subsequences(str.substring(1));
//        System.out.println(small);
        System.out.println(ans);
        for (String ss : small) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }

    //    better approach:
    static List<String> printSSQ(String s, String currAns, List<String> list) {   // abc, ""
        if (s.isEmpty()) {
            list.add(currAns + " ");
            return list;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, currAns + curr, list); // include current
        printSSQ(remString, currAns, list); //exclude current
        return list;
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<>();
//        System.out.print(subsequences(str));
        printSSQ(str, "", list);

        System.out.println(list);

    }
}
