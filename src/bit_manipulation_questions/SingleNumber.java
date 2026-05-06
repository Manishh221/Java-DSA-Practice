package bit_manipulation_questions;

public class SingleNumber {
    // print the unique element:
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 4, 3, 4, 3};
        int XOR = 0;
        for (int i = 0; i < arr.length; i++) {
            XOR ^= arr[i];
        }
        System.out.println(XOR);
    }
}
