package graph_questions.DFS_questions;

import java.util.*;

public class TopologicalSortDirectedGraph_DFS {
    public static void main(String[] args) {

        int[][] directedArray = {{1, 0}, {2, 0}, {3, 1}, {3,2}};
        int n = directedArray.length;

        List<List<Integer>> adjacencyList = createAdjacencyList(directedArray, n);

        List<Integer> ans = new ArrayList<>();
        boolean[] isVisited = new boolean[adjacencyList.size()];
        for (int i = 0; i < adjacencyList.size(); i++) {
            if (!isVisited[i]) {
                DFS(adjacencyList, isVisited, ans, i);
            }
        }
        int result[] = ans.reversed().stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(result));

    }

    private static void DFS(List<List<Integer>> adjacencyList, boolean[] isVisited, List<Integer> ans, int i) {
        isVisited[i] = true;
        for (int element : adjacencyList.get(i)) {
            if (!isVisited[element]) {
                DFS(adjacencyList, isVisited, ans, element);
            }
            ans.add(i);
        }
    }

    public static List<List<Integer>> createAdjacencyList(int[][] prerequisites, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            ans.get(b).add(a); // --> directed adjacency List
        }
        System.out.println(ans);
        return ans;
    }
}
