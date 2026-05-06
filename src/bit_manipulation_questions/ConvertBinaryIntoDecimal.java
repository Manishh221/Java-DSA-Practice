package bit_manipulation_questions;

public class ConvertBinaryIntoDecimal {
    public static void main(String[] args) {

        int[] binary = {1, 0, 1, 1, 0};
        int idx = binary.length - 1;
        int decimal = 0;

        for (int i = 0; i < binary.length; i++) {
            decimal += (int) (Math.pow(2, idx) * binary[i]);
            idx--;
        }
        System.out.println(decimal);
    }
}
