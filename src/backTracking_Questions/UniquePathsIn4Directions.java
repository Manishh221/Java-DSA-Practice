package backTracking_Questions;

import java.util.ArrayList;
import java.util.List;

/*
Consider a rat placed at position (0, 0) in an n x n square matrix maze[][]. The rat's goal is to reach the destination at
 position (n-1, n-1). The rat can move in four possible directions: 'U'(up), 'D'(down), 'L' (left), 'R' (right).

The matrix contains only two possible values:

0: A blocked cell through which the rat cannot travel.
1: A free cell that the rat can pass through.
Your task is to find all possible paths the rat can take to reach the destination, starting from (0, 0) and ending at (n-1, n-1),
 under the condition that the rat cannot revisit any cell along the same path. Furthermore, the rat can only move to adjacent cells that
 are within the bounds of the matrix and not blocked.
If no path exists, return an empty list.
 */
public class UniquePathsIn4Directions {
    public static void main(String[] args) {

        int grid[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        int row = grid.length - 1;
        int col = grid[0].length - 1;
        List<String> ansList = new ArrayList<>();

        findAllPathsRatCanMove(0, 0, grid, row, col, ansList, "");
        System.out.println(ansList);
    }

    private static void findAllPathsRatCanMove(int rr, int rc, int[][] grid, int row, int col, List<String> ansList, String ans) {

        if (rr == row && rc == col) {
            ansList.add(ans);
            return;
        }

        if (rr > row || rc > col) return;
        if (rr < 0 || rc < 0) return;
        if (grid[rr][rc] == 0) return;
        grid[rr][rc] = 0;

        findAllPathsRatCanMove(rr + 1, rc, grid, row, col, ansList, ans + "D");
        findAllPathsRatCanMove(rr, rc + 1, grid, row, col, ansList, ans + "R");
        findAllPathsRatCanMove(rr - 1, rc, grid, row, col, ansList, ans + "U");
        findAllPathsRatCanMove(rr, rc - 1, grid, row, col, ansList, ans + "L");
        grid[rr][rc] = 1;
    }
}
