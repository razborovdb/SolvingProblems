package org.sort.bubblesort;

public class BubbleSort {
    static int[] solution(int[] a) {
        int n = a.length;
        for (int j = 0; j < n-1; j++) {
            for (int i = 0; i < n-j-1; i++) {
                if(a[i] > a[i+1]) {
                    int temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[] {81, 82, 5, 21, 46, 74, 73, 97, 53, 23};
        solution(a);
        print(a);
    }

    static void print(int[] a) {
        for (int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

