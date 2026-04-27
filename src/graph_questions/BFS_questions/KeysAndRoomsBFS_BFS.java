package graph_questions.BFS_questions;

import java.util.*;

public class KeysAndRoomsBFS_BFS {

    public static void main(String[] args) {
        List<List<Integer>> adjecencyList = new ArrayList<>();
        adjecencyList.add(List.of(1,3));
        adjecencyList.add(List.of(3,0,1));
        adjecencyList.add(List.of(2));
        adjecencyList.add(List.of(0));

        System.out.println(canVisitAllRooms(adjecencyList));

    }

    public static boolean canVisitAllRooms(List<List<Integer>> adjencyList) {
        boolean[] isVisited = new boolean[adjencyList.size()];
        isVisited[0] = true;
        BFS(0, adjencyList, isVisited);

        for (boolean element : isVisited) if (!element) return false;

        return true;
    }

    public static void BFS(int start, List<List<Integer>> adjencyList, boolean[] isVisited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int peek = queue.poll();
           for (int element : adjencyList.get(peek)){
               if (!isVisited[element]) {
                   queue.add(element);
                   isVisited[element] = true;
               }
           }
        }
    }
}




