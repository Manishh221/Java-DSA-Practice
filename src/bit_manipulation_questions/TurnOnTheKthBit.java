package bit_manipulation_questions;

public class TurnOnTheKthBit {

    public static void main(String[] args) {

        int number = 500;  // 111110100 convert into 111111100
        int k = 3;
        System.out.println((1<<k) | number);

    }
}
