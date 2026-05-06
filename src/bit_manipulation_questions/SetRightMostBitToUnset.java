package bit_manipulation_questions;

public class SetRightMostBitToUnset {

    // set right most bit to unSet:
    public static void main(String[] args) {
        int number = 6;

        // formula = (number | number + 1)

        System.out.println(number | (number + 1));
    }
}
