package graph_questions.DijksstraAlgorithm;

import java.util.*;

public class PathWithMaximumProbability {

    static class Pair implements Comparable<Pair> {
        int node;
        double probability;

        Pair(int node, double probability) {
            this.node = node;
            this.probability = probability;
        }
        @Override
        public String toString() {
            return "Pair{" +
                    "node=" + node +
                    ", time=" + probability +
                    '}';
        }
        @Override
        public int compareTo(Pair o) {
            return Double.compare(this.probability, o.probability);
        }
    }

    public static void main(String[] args) {
       int n = 3;
       int[][] edges = {{0,1},{1,2},{0,2}};
        double[]succProb = {0.5,0.5,0.2};
        double[] result = new double[n];
        int start = 0, end = 2;
        List<List<Pair>> adjacencyList = new ArrayList<>();
       createAdjacencyList(edges, adjacencyList,  n, succProb);

        System.out.println(adjacencyList);
        BFS(adjacencyList,result ,start, end);

        if (adjacencyList.get(end).isEmpty()){
            result[0] = 0;
            System.out.println("No path exist: " + result[0]);
        } else {
            System.out.println((result[end]));
        }

        System.out.println(Arrays.toString(result));

    }


    public static void BFS(List<List<Pair>> adjacencyList,  double[] succProb , int start, int end) {
        Arrays.fill(succProb,0);
        PriorityQueue<Pair> pairs = new PriorityQueue<>(Collections.reverseOrder());
        int node;
        double probablity;
        pairs.add(new Pair(start, 1));

        while (!pairs.isEmpty()) {
            Pair pair = pairs.remove();
            node = pair.node;
            probablity = pair.probability;
            if (probablity<succProb[node]) continue;
            for (Pair pair1 : adjacencyList.get(node)) {
                double totalProbality = probablity * pair1.probability;
                if (totalProbality>succProb[pair1.node]){
                    succProb[pair1.node] = totalProbality;
                    pairs.add(new Pair(pair1.node, totalProbality));
                }
            }
        }
    }

    public static void createAdjacencyList(int[][] edges, List<List<Pair>> adjacencyList, int n,  double[]succProb) {

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        adjacencyList.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
           double prob = succProb[i];
           adjacencyList.get(edges[i][0]).add(new Pair(edges[i][1], prob));
           adjacencyList.get(edges[i][1]).add(new Pair(edges[i][0], prob));
        }
    }
}
