//Connect n ropes with minimum cost
/*  N ropes of different lengths, the task is to connect these ropes into one rope with
minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths. */

import java.util.*;

public class QueueB {
    public static int connectRopes(int arr[]) {
        int profit = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        // priority queue remove smallest element first
        while (pq.size() >= 2) {
            int p1 = pq.remove();
            int p2 = pq.remove();

            int p = p1 + p2;
            pq.add(p);
            profit = profit + p;
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr1[] = { 4, 3, 2, 6 };
        int arr2[] = { 1, 2, 3 };

        int ans1 = connectRopes(arr1);
        System.out.println(ans1);

        int ans2 = connectRopes(arr2);
        System.out.println(ans2);
    }
}
