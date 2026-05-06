package bit_manipulation_questions;

public class KthBitIsSetOrNot {

    public static void main(String[] args) {
        int number = 500;   // 111110100 >> 3 = 111110   last is zero every even number last digit will be 0 and for the odd will be 1
        int k = 3;

        System.out.println((number >> k) % 2 == 0);

        // so it is a set:
    }
}
