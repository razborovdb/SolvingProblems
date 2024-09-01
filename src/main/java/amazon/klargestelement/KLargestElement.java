package amazon.klargestelement;

import java.util.PriorityQueue;

public class KLargestElement {
    static void kLargest(int a[], int n, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : a) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
    // Driver Code
    public static void main(String[] args)
    {
        int a[]
                = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };

        int n = a.length;
        int k = 3;
        System.out.print(k + " largest elements are : ");
        // Function Call
        kLargest(a, n, k);
    }
}
