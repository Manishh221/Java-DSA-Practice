package graph_questions.DFS_questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleDetectionUnDirectedGraph_DFS {

    public static void main(String[] args) {

//        List<List<Integer>> adjacencyList = new ArrayList<>();
//
//        adjacencyList.add(List.of(1, 2));   // 0 connected to 1,2
//        adjacencyList.add(List.of(0, 2));   // 1 connected to 0,2
//        adjacencyList.add(List.of(0, 1));   // 2 connected to 0,1
//        adjacencyList.add(List.of());       // 3 isolated


        List<List<Integer>> adjacencyList = new ArrayList<>();
        adjacencyList.add(List.of(1));
        adjacencyList.add(List.of(0, 2));
        adjacencyList.add(List.of(1, 3));
        adjacencyList.add(List.of(2));

        boolean flag = false;
        boolean[] isVisited = new boolean[adjacencyList.size()];

        for (int i = 0; i < adjacencyList.size(); i++) {
            if (!isVisited[i]) {
                flag = DFS(adjacencyList, isVisited, i, -1);
                if (flag) {
                    break;
                }
            }
        }
        System.out.println(flag);
    }

    private static boolean DFS(List<List<Integer>> adjacencyList,
                               boolean[] isVisited,
                               int node,
                               int parent) {
        isVisited[node] = true;
        for (int neighbor : adjacencyList.get(node)) {
            if (!isVisited[neighbor]) {
                if (DFS(adjacencyList, isVisited, neighbor, node)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
}
