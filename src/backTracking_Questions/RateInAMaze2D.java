package backTracking_Questions;

public class RateInAMaze2D {


    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

//        System.out.println(maze2D(1, 1, rows, cols));
        boolean[][] isVisited = new boolean [rows][cols]; // by default -> false
        print(0,0, rows-1,cols-1, "", isVisited);

    }


    // solving using backtracking:
    private static void print(int startingRow, int startingCol, int endingRow, int endingCol, String result, boolean[][] isVisited) {
        if(startingRow<0 || startingCol<0) return;
        if(startingRow>endingRow || startingCol>endingCol) return;
        if(isVisited[startingRow] [startingCol] == true) return; // V imp

        if(startingRow==endingRow && startingCol==endingCol) {
            System.out.println(result);
            return;
        }

        isVisited[startingRow] [startingCol] = true;
// go right
        print(startingRow, startingCol+1, endingRow, endingCol, result+"R", isVisited);
// go down
        print(startingRow+1,startingCol, endingRow, endingCol, result+"D", isVisited);
// go left
        print(startingRow, startingCol-1, endingRow, endingCol, result+"L", isVisited);
// go up
        print(startingRow-1,startingCol,endingRow, endingCol, result+"U", isVisited);

        isVisited[startingRow] [startingCol] = false;
    }


    // solving using recursion:
    public static int maze2D(int startingRow, int startingCol, int endingRow, int endingCol) {

        if (startingRow >= endingRow || startingCol >= endingCol) return 1;

        int rightWay = maze2D(startingRow, startingCol + 1, endingRow, endingCol);
        int downWay = maze2D(startingRow + 1, startingCol, endingRow, endingCol);

        return rightWay + downWay;
    }
}
