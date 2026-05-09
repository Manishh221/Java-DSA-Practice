package recursion_Questions;

public class LookAndSayPattern {

    public static void main(String[] args) {

        String str = "1";
        int k = 4;
        System.out.println(lookAndSay(k));
    }

    public static String lookAndSay(int n) {

        if (n == 1) return "1";
        String s = lookAndSay(n - 1);
        String ans = "";
        int i = 0, j = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int freq = j - i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }
        }
        int freq = j - i;
        ans += freq;
        ans += s.charAt(i);
        return ans;
    }
}
