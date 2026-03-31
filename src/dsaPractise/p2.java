package dsaPractise;

import java.util.Arrays;
import java.util.Stack;

public class p2 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 6, 8, 7, 1};
        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack();
        st.push(arr[arr.length - 1]);
        res[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < st.peek()) {
                res[i] = st.peek();
                st.push(arr[i]);

            } else {

                while (!st.isEmpty() && arr[i] > st.peek()) {
                    st.pop();
                }

                if (!st.isEmpty()) {
                    res[i] = st.peek();


                } else {
                    res[i] = -1;

                }
                st.push(arr[i]);
            }
        }


        System.out.println(Arrays.toString(res));
    }
}
