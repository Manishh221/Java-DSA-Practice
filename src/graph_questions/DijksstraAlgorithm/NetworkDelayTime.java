package graph_questions.DijksstraAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {

    static class Pair implements Comparable<Pair> {
        int node;
        int time;

        Pair(int node, int time) {
            this.node = node;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "node=" + node +
                    ", time=" + time +
                    '}';
        }

        @Override
        public int compareTo(Pair o) {
            return this.time - o.time;
        }
    }

    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        List<List<Pair>> adjacencyList = new ArrayList<>();
        int n = 4;
        int k = 2;
        createAdjacencyList(times, adjacencyList, n);
        System.out.println(adjacencyList);
        int[] result = new int[adjacencyList.size()];
        BFS(adjacencyList, k, result);

        System.out.println(calculateTotalTime(result));

    }

    public static void BFS(List<List<Pair>> adjacencyList, int k, int[] result) {
        Arrays.fill(result, Integer.MAX_VALUE);
        result[0] = 0;
        PriorityQueue<Pair> pairs = new PriorityQueue<>();
        int time;
        int node;
        pairs.add(new Pair(k, 0));
        result[k] = 0;

        while (!pairs.isEmpty()) {
            Pair pair = pairs.remove();
            node = pair.node;
            time = pair.time;
            if (time > result[node]) continue;
            for (Pair pair1 : adjacencyList.get(node)) {
                int totalTime = time + pair1.time;
                if (totalTime < result[pair1.node]) {
                    result[pair1.node] = totalTime;
                    pairs.add(new Pair(pair1.node, totalTime));
                }
            }
        }
    }

    public static void createAdjacencyList(int[][] times, List<List<Pair>> adjacencyList, int n) {

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        adjacencyList.add(new ArrayList<>());
        for (int i = 0; i < times.length; i++) {
            adjacencyList.get(times[i][0]).add(new Pair(times[i][1], times[i][2]));
        }
    }


    public static int calculateTotalTime(int[] times){
        int max = -1;
        Arrays.sort(times);

        for (int i = 0; i < times.length ; i++) {
            if (times[i]==Integer.MAX_VALUE) return max;
        }
        return times[times.length-1];
    }

}
