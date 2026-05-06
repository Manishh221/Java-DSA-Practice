package bit_manipulation_questions;

public class PowerOf2 {

    // find the number is the power of 2 is not
    public static void main(String[] args) {
        int number = 32;
        System.out.println(number & (number - 1));            // formula (n&(n-1)) because every number which follows the 2 to power rule and subtract -1 we always get 1 in every bit
    }
}
