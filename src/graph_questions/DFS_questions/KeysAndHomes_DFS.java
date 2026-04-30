package graph_questions.DFS_questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndHomes_DFS {
    public static void main(String[] args) {
        List<List<Integer>> adjecencyList = new ArrayList<>();
        adjecencyList.add(List.of(1, 3));
        adjecencyList.add(List.of(3, 0, 1));
        adjecencyList.add(List.of(2));
        adjecencyList.add(List.of(0));

        System.out.println(canVisitAllRooms(adjecencyList));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> adjencyList) {
        boolean[] isVisited = new boolean[adjencyList.size()];
        isVisited[0] = true;
        DFS(0, adjencyList, isVisited);
        for (boolean element : isVisited) if (!element) return false;
        return true;
    }

    public static void DFS(int start, List<List<Integer>> adjencyList, boolean[] isVisited) {
        isVisited[start] = true;
        for (int element : adjencyList.get(start))
            if (!isVisited[element]) DFS(element, adjencyList, isVisited);
    }
}


