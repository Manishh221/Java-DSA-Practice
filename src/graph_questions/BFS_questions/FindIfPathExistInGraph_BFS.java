package graph_questions.BFS_questions;

import java.util.*;

public class FindIfPathExistInGraph_BFS {
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
        BFS(source,isVisited,adjacentList);

       if (!isVisited[destination]) return false;
        return true;
    }

    public static void BFS(int source, boolean[] isVisited, List<List<Integer>> adjancencyList){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
         isVisited[source] = true;
        while(!queue.isEmpty()){
            int front = queue.remove();
            for (int element : adjancencyList.get(front)) {
                if (!isVisited[element]){
                    queue.add(element);
                    isVisited[element] = true;
                }
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

