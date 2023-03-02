package org.bloomtech.bd.codealong;

public class MovingWindows {
    public static void main(String[] args) {
        MovingWindows mw = new MovingWindows();
        int[] arr = {1, 4, -5, 6, -3};
        double[] result = mw.solution(arr, 3);
    }
    public double[] solution(int[] a, int window_size) {
        double[] result = new double[a.length - window_size +1];
        int k = 0;
        // TODO Your Code Here.
        for (int i =0; i < a.length - window_size+1; i++) {
            double sum = 0.0;
            for (int j=i; j< i+window_size;j++) {
                sum += a[j];
            }
            System.out.println(sum);
            sum /= window_size;
            result[k] = sum;
            k++;
        }
        return result;
    }
}
