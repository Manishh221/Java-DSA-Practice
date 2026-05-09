package graph_questions.BFS_questions;

import java.util.ArrayList;
import java.util.List;

/*
A bipartite graph is a graph whose vertices can be divided into two independent sets, \(U\) and \(V\),
 such that every edge connects a vertex in \(U\) to one in \(V\)

1. any acyclic graph is bipertite
2. if the cycle length is even is a bipertite
3. if the cycle is odd is not bipertite

 */
public class IsGraphBipertite {

    public static void main(String[] args) {
        List<List<Integer>> adjecencyList = new ArrayList<>();
        adjecencyList.add(List.of(1,3));
        adjecencyList.add(List.of(3,0,1));
        adjecencyList.add(List.of(2));
        adjecencyList.add(List.of(0));


    }
}
