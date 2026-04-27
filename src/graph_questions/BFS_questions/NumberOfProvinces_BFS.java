package graph_questions.BFS_questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces_BFS {
    public static void main(String[] args) {

        int adjacency[][] = {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        boolean isVisited[] = new boolean[adjacency.length];
        System.out.println(findNumberOfProvinces(adjacency, isVisited));
        System.out.println(Arrays.toString(isVisited));

    }

    public static int findNumberOfProvinces(int[][] adjacency, boolean isVisited[]) {
        int count = 0;

        for (int i = 0; i < adjacency.length; i++) {
            if (!isVisited[i]) {
                BFS(adjacency, isVisited, i);
                count++;
            }
        }
        return count;
    }

    public static void BFS(int adjacency[][], boolean isVisited[], int i) {
        isVisited[i] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);

        while (!queue.isEmpty()) {
            int front = queue.remove();
            for (int j = 0; j < adjacency.length; j++) {
                    if (adjacency[front][j] == 1 && isVisited[j]==false) {
                        queue.add(j);
                        isVisited[j] = true;
                }
            }
        }
    }
}
