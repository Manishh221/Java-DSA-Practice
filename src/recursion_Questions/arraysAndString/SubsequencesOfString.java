package recursion_Questions.arraysAndString;

import java.util.ArrayList;

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
    static void printSSQ(String s, String currAns) {   // abc, ""
        if (s.isEmpty()) {
            System.out.print(currAns + " ");
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, currAns + curr); // include current
        printSSQ(remString, currAns); //exclude current
    }


    public static void main(String[] args) {
        String str = "abc";
//        System.out.print(subsequences(str));
        printSSQ(str, "");


    }
}
