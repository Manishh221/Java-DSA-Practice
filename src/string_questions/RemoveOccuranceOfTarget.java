package string_questions;

public class RemoveOccuranceOfTarget {

    static void main() {

        String str = "manish";
        char target = 'a';
        String str2 = "";

        for (int i = 0; i < str.length() ; i++) {

            if (str.charAt(i) != target){
                str2+=str.charAt(i);
            }

        }

        System.out.println(str2);
    }
}
