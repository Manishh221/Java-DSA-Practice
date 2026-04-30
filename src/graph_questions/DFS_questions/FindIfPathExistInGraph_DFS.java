package graph_questions.DFS_questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindIfPathExistInGraph_DFS {
    public static void main(String[] args) {

        int arr[][] = {{0,1},{4,1},{1,2},{2,3},{7,5},{6,7}};
        int origin = 0;
        int destination = 1;
        int n = 8;
        System.out.println(validPath(n,arr,origin,destination));
    }

    public static boolean validPath(int n, int[][] arr, int source, int destination) {
        if (source==destination) return true;
        List<List<Integer>> adjacentList =  createAdjacentList(arr, n);
        boolean [] isVisited = new boolean[n];
        DFS(source,isVisited,adjacentList);
        if (!isVisited[destination]) return false;
        return true;
    }

    public static void DFS(int source, boolean[] isVisited, List<List<Integer>> adjancencyList){
        isVisited[source] = true;

            for (int element : adjancencyList.get(source)) {
                if (!isVisited[element]){
                    isVisited[element] = true;
                    DFS(element, isVisited, adjancencyList);
                }
            }
        }


public static List<List<Integer>> createAdjacentList(int arr[][], int n){
    List<List<Integer>> adjacencyList = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        adjacencyList.add(new ArrayList<>());
    }
    for (int i = 0; i < arr.length; i++) {
        int a = arr[i][0];
        int b = arr[i][1];
        adjacencyList.get(a).add(b);
        adjacencyList.get(b).add(a);
    }
    return adjacencyList;
}

}
