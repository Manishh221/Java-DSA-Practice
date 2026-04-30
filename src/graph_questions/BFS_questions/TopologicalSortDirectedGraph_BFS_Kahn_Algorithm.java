package graph_questions.BFS_questions;

import java.util.*;

public class TopologicalSortDirectedGraph_BFS_Kahn_Algorithm {
    public static void main(String[] args) {

        int[][] que = {{0,1}, {1, 2},{1,3}, {2, 3}, {2,4},{4,3}};
        int n = 5;
        int inDigree[] = new int[n];

        List<List<Integer>> adjacencyList = createAdjacencyList(que,inDigree, n);

        List<Integer> ans = new ArrayList<>();

        System.out.println("InDegree Array: " + Arrays.toString(inDigree));

            BFS(adjacencyList,inDigree,ans,n);

        int result[] = ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("ans " + Arrays.toString(result));

    }
    private static void BFS(List<List<Integer>> adjacencyList,int[] indegree, List<Integer> ans, int n) {
         Queue<Integer> queue = new LinkedList<>();

        for (int j = 0; j < indegree.length; j++) {
            if (indegree[j]==0) {
                queue.add(j);
            }
        }
         while(!queue.isEmpty()){
            int node = queue.poll();
            ans.add(node);
             for (int element : adjacencyList.get(node)) {
                 indegree[element]-=1;
                 if(indegree[element]==0){
                     queue.add(element);
                 }
             }
         }
    }

    public static List<List<Integer>> createAdjacencyList(int[][] prerequisites,int[]inDegree, int n) {
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
