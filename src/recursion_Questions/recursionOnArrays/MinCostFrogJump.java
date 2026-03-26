package recursion_Questions.recursionOnArrays;

/*
There are N stones, numbered 0,1,2,...,N-1. For each i (0 <= i < N) the height of Stone i is hi. There is a frog who is initially on Stone 0. He will repeat the following action some number of times to reach Stone N-1:
If the frog is currently on Stone i, jump to Stone i + 1 or Stone i + 2
Here, a cost of hi - hj| is incurred, where j is the stone to land on.
Find the minimum possible total cost incurred before the frog reaches Stone N.

Input n = 4
arr[]=10 30 40 20
Output= 30

approachh
arr[]  = {10,30,40,50}
0 -> 1 -> 2 -> 3 = 20 + 10 + 20 = 50
0 -> 2 -> 2 = 30 + 20 = 50
0 -> 1 -> 2 = 20 + 10 = 30   ans
SKILLS
* */


public class MinCostFrogJump {

    static int best(int[] stones, int length, int idx){
        if(idx == length - 1) return 0;
        int op1= Math.abs(stones[idx] - stones[idx+1]) + best(stones, length, idx+1);
        if(idx== length-2) return op1;
        int op2 = Math.abs(stones[idx] - stones[idx+2]) + best(stones, length, idx+2);
        return Math.min(op1, op2);
    }

    public static void main(String[] args) {

        int stones[] = {10,30,40,20};
        int idx = 0;
//        System.out.println(best(stones, stones.length, idx));

        System.out.println(idx++);
        System.out.println(idx);

    }
}
