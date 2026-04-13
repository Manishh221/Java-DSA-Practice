package backTracking_Questions;

public class RateInAMaze_01 {


    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        maze2D(1, 1, rows, cols, "");

    }

    // solving using recursion:
    public static void maze2D(int startingRow, int startingCol, int endingRow, int endingCol, String result) {

        // base case (destination reached)
        if (startingRow == endingRow && startingCol == endingCol) {
            System.out.println(result);
            return;
        }

        // boundary check
        if (startingRow > endingRow || startingCol > endingCol) return;
        // move right
        maze2D(startingRow, startingCol + 1, endingRow, endingCol, result + "R");
        // move down
        maze2D(startingRow + 1, startingCol, endingRow, endingCol, result + "D");
    }
}
