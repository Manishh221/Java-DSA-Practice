package graph_questions.BFS_questions;

import java.util.*;

public class NumberOfIslands_BFS {
    public static void main(String[] args) {

        char[][] landAndWater = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        boolean[][] isVisited = new boolean[landAndWater.length][landAndWater[0].length];
        int count = 0;
        for (int i = 0; i < landAndWater.length; i++) {
            for (int j = 0; j < landAndWater[i].length; j++) {
                if (!isVisited[i][j] && landAndWater[i][j] == '1') {
                    BFS(landAndWater, isVisited, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static void BFS(char[][] grid, boolean[][] visited, int row, int col) {

        int r = grid.length;
        int c = grid[0].length;

        Queue<List<Integer>> q = new LinkedList<>();
        q.add(List.of(row, col));
        visited[row][col] = true;

        while (!q.isEmpty()) {

            List<Integer> current = q.poll();

            int tempRow = current.get(0);
            int tempCol = current.get(1);

            // top
            if (tempRow > 0 &&
                    grid[tempRow - 1][tempCol] == '1' &&
                    !visited[tempRow - 1][tempCol]) {

                q.add(List.of(tempRow - 1, tempCol));
                visited[tempRow - 1][tempCol] = true;
            }

            // bottom
            if (tempRow + 1 < r &&
                    grid[tempRow + 1][tempCol] == '1' &&
                    !visited[tempRow + 1][tempCol]) {

                q.add(List.of(tempRow + 1, tempCol));
                visited[tempRow + 1][tempCol] = true;
            }

            // left
            if (tempCol > 0 &&
                    grid[tempRow][tempCol - 1] == '1' &&
                    !visited[tempRow][tempCol - 1]) {

                q.add(List.of(tempRow, tempCol - 1));
                visited[tempRow][tempCol - 1] = true;
            }

            // right
            if (tempCol + 1 < c &&
                    grid[tempRow][tempCol + 1] == '1' &&
                    !visited[tempRow][tempCol + 1]) {
                q.add(List.of(tempRow, tempCol + 1));
                visited[tempRow][tempCol + 1] = true;
            }
        }
    }

}

