package graph_questions.BFS_questions;

import java.util.*;

public class FindEventualSafeStates {

    public static void main(String[] args) {

      int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};
      int[] inDegree = new int[graph.length];
      List<List<Integer>> reversedGraph = reverseGraphEdges(graph, inDegree);
        System.out.println("In Degree: " + Arrays.toString(inDegree));
        List<Integer> ans = new ArrayList<>();
        BSF(reversedGraph,inDegree,ans);
        System.out.println("reversed Graph: " + reversedGraph);
        Collections.sort(ans);
        System.out.println("ans array: " + ans);
    }


    public static void BSF(List<List<Integer>> reversedGraph, int[] indegree, List<Integer> ans){

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < reversedGraph.size() ; i++) {
            if (indegree[i] == 0) queue.add(i);
        }

        while(!queue.isEmpty()){
            int front = queue.poll();
            ans.add(front);

            for (int element : reversedGraph.get(front)){
                indegree[element]-=1;
                if (indegree[element]==0){
                    queue.add(element);
                }
            }
        }
    }

    public static List<List<Integer>> reverseGraphEdges(int[][] graph, int [] inDegree){
        List<List<Integer>> reversedList = new ArrayList<>();
        for (int i = 0; i < graph.length ; i++) {
            reversedList.add(new ArrayList<>());
        }
            for (int i = 0; i < graph.length ; i++) {
                for (int element : graph[i]){
                    reversedList.get(element).add(i);
                    inDegree[i]++;
                }
            }
            return reversedList;
        }
}
