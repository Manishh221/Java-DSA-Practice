package recursion_Questions.arraysAndString;

import java.util.Arrays;

public class ReverseString {

    static void reverseString(char str [], int a, int b){

        if (a>b){
            return;
        }

        System.out.println(Arrays.toString(str) + " ");
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;

        reverseString(str, a+1, b-1);
    }

    public static void main(String[] args) {

        String str = "abcde";
        char arr[] = str.toCharArray();
        int a =0;
        int b = arr.length-1;

        reverseString(arr,a,b);

    }
}
