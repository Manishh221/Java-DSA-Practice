package bit_manipulation_questions;

public class NumberOf1Bit {

    public static void main(String[] args) {

        int n = 500;
        int count = 0;

        for (int i = 0; i < 31; i++) {
            if ((n >> i) % 2 != 0) count++;
        }

        System.out.println(count);

    }
}
