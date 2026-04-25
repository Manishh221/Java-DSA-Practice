package heap_questions;

import org.w3c.dom.Entity;

import java.util.*;

class Triplet implements Comparable<Triplet> {

    int distance;
    int x;
    int y;

    public Triplet(int distance, int x, int y) {
        this.distance = distance;
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Triplet o) {
        return Integer.compare(this.distance, o.distance);
    }
}

public class KthClosestPointToOrigin {

    public static void main(String[] args) {

        int arr[][] = {{1, 2}, {4, 5}, {0, 1}, {9, 10}};
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        int k = 2;

        for (int[] element : arr) {
            int dist = element[0] * element[0] + element[1] * element[1];
            int x = element[0];
            int y = element[1];
            pq.add(new Triplet(dist, x, y));
            if (pq.size() > k) pq.remove();
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i <= pq.size(); i++) {
            Triplet t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }

        for (int[] e : ans) {
            System.out.println(Arrays.toString(e));
        }
    }
}
