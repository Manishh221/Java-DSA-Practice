package backTracking_Questions;

/*
A maze is an N*N binary matrix of blocks where the upper left block is known as the Source block, and the lower rightmost
block is known as the Destination block. If we consider the maze, then maze [0] [0] is the source, and maze [N-1] [N-1] is the destination.
 Our main task is to reach the destination from the source. We have considered a rat as a character that can move either forward or downwards or leftwords or upwords
In the maze matrix, a few dead blocks will be denoted by 0 and active blocks will be denoted by 1. A rat can move only in the active blocks.
 */


public class RateInAMaze_03 {
    
    private static void rateInAMazeWithoutUsingExtraArray(int startingRow, int startingCol,
                                                          int endingRow, int endingCol,
                                                          String result,
                                                          int[][] maze) {
        // boundary check
        if (startingRow < 0 || startingCol < 0 ||
                startingRow > endingRow || startingCol > endingCol)
            return;

        // blocked OR already visited
        if (maze[startingRow][startingCol] == 0 ||
                maze[startingRow][startingCol] == -1)
            return;

        // destination
        if (startingRow == endingRow && startingCol == endingCol) {
            System.out.print(result + " ");
            return;
        }

        // 🔥 MARK visited
        maze[startingRow][startingCol] = -1;

        // explore
        rateInAMazeWithoutUsingExtraArray(startingRow, startingCol + 1,
                endingRow, endingCol, result + "R", maze);

        rateInAMazeWithoutUsingExtraArray(startingRow + 1, startingCol,
                endingRow, endingCol, result + "D", maze);

        rateInAMazeWithoutUsingExtraArray(startingRow, startingCol - 1,
                endingRow, endingCol, result + "L", maze);

        rateInAMazeWithoutUsingExtraArray(startingRow - 1, startingCol,
                endingRow, endingCol, result + "U", maze);

        // 🔥 UNDO (backtrack)
        maze[startingRow][startingCol] = 1;
    }

    private static void rateInAMaze4D(int startingRow, int startingCol,
                                      int endingRow, int endingCol,
                                      String result,
                                      boolean[][] isVisited,
                                      int[][] maze) {

        // boundary check
        if (startingRow < 0 || startingCol < 0 ||
                startingRow > endingRow || startingCol > endingCol)
            return;

        // blocked cell
        if (maze[startingRow][startingCol] == 0)
            return;

        // visited check
        if (isVisited[startingRow][startingCol])
            return;

        // destination
        if (startingRow == endingRow && startingCol == endingCol) {
            System.out.print(result + " ");
            return;
        }
        // mark visited
        isVisited[startingRow][startingCol] = true;
        // right
        rateInAMaze4D(startingRow, startingCol + 1, endingRow, endingCol,
                result + "R", isVisited, maze);
        // down
        rateInAMaze4D(startingRow + 1, startingCol, endingRow, endingCol,
                result + "D", isVisited, maze);

        // left
        rateInAMaze4D(startingRow, startingCol - 1, endingRow, endingCol,
                result + "L", isVisited, maze);

        // up
        rateInAMaze4D(startingRow - 1, startingCol, endingRow, endingCol,
                result + "U", isVisited, maze);

        // UNDO
        isVisited[startingRow][startingCol] = false;
    }


    public static void main(String[] args) {

        int row = 4;
        int col = 4;

        int[][] maze = {
                {1, 0, 1, 1},   // 0 are thee obstacles where rat can not go through the route:
                {1, 1, 1, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1}};

        boolean[][] isVisited = new boolean[row][col];   // O(n*M)

//        rateInAMaze(0, 0, n, n, "", maze);
//        rateInAMaze4D(0, 0, row - 1, col - 1, "", isVisited, maze);
        rateInAMazeWithoutUsingExtraArray(0, 0, row - 1, col - 1, "", maze);
    }

    // only right and down side a rat can travel:
    private static void rateInAMaze(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0) return;
// go right
        rateInAMaze(sr, sc + 1, er, ec, s + "R", maze);
// go down
        rateInAMaze(sr + 1, sc, er, ec, s + "D", maze);
    }
}
