package graph_questions.BFS_questions;

import java.util.*;

public class CourseScheduled_02 {
    public static void main(String[] args) {

        int[][] que = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int n = 4;
        System.out.println(Arrays.toString(courseSchedule(que, n)));

    }


    public static int[] courseSchedule(int[][] prerequisites, int n) {

        int inDigree[] = new int[n];

        List<List<Integer>> adjacencyList = createAdjacencyList(prerequisites, inDigree, n);

        List<Integer> ans = new ArrayList<>();

        System.out.println("InDegree Array: " + Arrays.toString(inDigree));

        BFS(adjacencyList, inDigree, ans, n);

        int result[] = ans.reversed().stream()
                .mapToInt(Integer::intValue)
                .toArray();

        if (result.length < n) return new int[0];

        return result;

    }

    private static void BFS(List<List<Integer>> adjacencyList, int[] indegree, List<Integer> ans, int n) {
        Queue<Integer> queue = new LinkedList<>();

        for (int j = 0; j < indegree.length; j++) {
            if (indegree[j] == 0) {
                queue.add(j);
            }
        }
        while (!queue.isEmpty()) {
            int node = queue.poll();
            ans.add(node);
            for (int element : adjacencyList.get(node)) {
                indegree[element] -= 1;
                if (indegree[element] == 0) {
                    queue.add(element);
                }
            }
        }
    }

    public static List<List<Integer>> createAdjacencyList(int[][] prerequisites, int[] inDegree, int n) {
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

