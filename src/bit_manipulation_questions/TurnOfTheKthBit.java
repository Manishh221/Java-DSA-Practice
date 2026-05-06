package bit_manipulation_questions;

public class TurnOfTheKthBit {

    // iff one is in the kth bit convert into zero and if zero so leavet same
    public static void main(String[] args) {

    int number = 508;  // 111110100 convert into 111111100
    int k = 3;

        System.out.println(~(1<<k) & number);
}
}
