package graph_questions.BFS_questions;

import java.util.*;

public class CycleDetectionUndirectedGraph_BFS {
    public static void main(String[] args) {

//        List<List<Integer>> adjacencyList = new ArrayList<>();
//        adjacencyList.add(List.of(1));
//        adjacencyList.add(List.of(0,2));
//        adjacencyList.add(List.of(1,3));
//        adjacencyList.add(List.of(2));

        List<List<Integer>> adjacencyList = new ArrayList<>();

        adjacencyList.add(List.of(1, 2));   // 0 connected to 1,2
        adjacencyList.add(List.of(0, 2));   // 1 connected to 0,2
        adjacencyList.add(List.of(0, 1));   // 2 connected to 0,1
        adjacencyList.add(List.of());       // 3 isolated


        boolean flag = false;
        boolean[] isVisited = new boolean[adjacencyList.size()];

        for (int i = 0; i < adjacencyList.size(); i++) {
            if (!isVisited[i]) {
                flag = BFS(adjacencyList, isVisited, i);
                if (flag==true){
                    break;
                }
            }
        }
        System.out.println(flag);
    }

    private static boolean BFS(List<List<Integer>> adjacencyList, boolean[] isVisited, int i) {
        isVisited[i] = true;
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(List.of(i, -1));

        while (!queue.isEmpty()) {
            List<Integer> pair = queue.remove();
            int node = pair.get(0);
            int parent = pair.get(1);

            for (int element : adjacencyList.get(node))
                if (!isVisited[element]) {
                    isVisited[element] = true;
                    queue.add(List.of(element, node));
                } else if (element != parent) {
                    return true;
                }
        }
        return false;
    }
}
