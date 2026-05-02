package graph_questions.DFS_questions;

import java.util.*;

public class CycleDetectionDirectedGraph {

    public static void main(String[] args) {

        int[][] que = {{1, 0}, {0, 1}};
        int n = 2;

        List<List<Integer>> adjacencyList = createAdjacencyList(que, n);
        List<Integer> ans = new ArrayList<>();
        boolean[] paths = new boolean[n];
        boolean[] isVisited = new boolean[n];

        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) flag = DFS(adjacencyList, isVisited, ans, paths, i, flag);
        }

        if (flag) System.out.println("cycle is in the graph ");
        else {
            System.out.println("not a cycle: ");
        }
    }

    private static boolean DFS(List<List<Integer>> adjacencyList, boolean[] isVisited, List<Integer> ans, boolean[] path, int i, boolean flag) {
        path[i] = true;
        isVisited[i] = true;
        for (int element : adjacencyList.get(i)) {
            if (path[element]) {
                flag = true;
                return flag;
            }
            if (!isVisited[element])
                flag = DFS(adjacencyList, isVisited, ans, path, element, flag);
                if (flag) return flag;
        }
        path[i] = false;
        return flag;
    }

    public static List<List<Integer>> createAdjacencyList(int[][] prerequisites, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            ans.get(a).add(b);
        }
        System.out.println("Adjacency list: " + ans);
        return ans;
    }
}
