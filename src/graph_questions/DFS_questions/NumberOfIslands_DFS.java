package graph_questions.DFS_questions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfIslands_DFS {
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
                    DFS(landAndWater, isVisited, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    private static void DFS(char[][] landAndWater, boolean[][] isVisited, int i, int j) {

        isVisited[i][j] = true;

        if (i - 1 >= 0 && !isVisited[i - 1][j] && landAndWater[i - 1][j] == '1')
            DFS(landAndWater, isVisited, i - 1, j);

        if (i + 1 <= landAndWater.length - 1 && !isVisited[i + 1][j] && landAndWater[i + 1][j] == '1')
            DFS(landAndWater, isVisited, i + 1, j);

        if (j > 0 && !isVisited[i][j - 1] && landAndWater[i][j - 1] == '1')
            DFS(landAndWater, isVisited, i, j - 1);

        if (j + 1 <= landAndWater[0].length - 1 && !isVisited[i][j + 1] && landAndWater[i][j + 1] == '1')
            DFS(landAndWater, isVisited, i, j + 1);
    }
}

