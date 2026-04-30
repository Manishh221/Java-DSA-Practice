package graph_questions.BFS_questions;

import java.util.*;

public class CourseSchedule {
    // this question same as detect cycle in a directed graph using BFS (Kha'n algorithm)
    public static void main(String[] args) {

        int[][] que = {{0, 1}, {1, 2}, {1, 3}, {2, 3}, {2, 4}, {4, 3}};
        int n = 5;
        int inDigree[] = new int[n];

        List<List<Integer>> adjacencyList = createAdjacencyList(inDigree, que, n);
        List<Integer> ans = new ArrayList<>();

        System.out.println("InDegree Array: " + Arrays.toString(inDigree));

        BFS(adjacencyList, inDigree, ans, n);

        if (ans.size() < n) System.out.println("cycle is in the graph ");
        else {
            System.out.println("not a cycle: ");
        }
    }

    private static void BFS(List<List<Integer>> adjacencyList, int[] indegree, List<Integer> ans, int n) {
        Queue<Integer> queue = new LinkedList<>();

        for (int j = 0; j < n; j++) {
            if (indegree[j] == 0) {
                queue.add(j);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            ans.add(node);
            for (int element : adjacencyList.get(node)) {
                indegree[element]--;
                if (indegree[element] == 0) {
                    queue.add(element);
                }
            }
        }
    }

    public static List<List<Integer>> createAdjacencyList(int[] inDegree, int[][] prerequisites, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            ans.get(a).add(b); // --> directed adjacency List
            inDegree[b]++;
        }
        System.out.println("Adjacency list: " + ans);
        return ans;
    }
}

