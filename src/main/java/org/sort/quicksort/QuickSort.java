package org.sort.quicksort;

public class QuickSort {
    static int[] solution(int[] a) {

        quickSort(a,0,a.length-1);

        return a;
    }


    static void quickSort(int[] a, int start, int end) {
        if (end <= start) return;
        System.out.println("start = " + start +"; end = " + end);

        int pivotIndex = partition(a, start, end);
        System.out.println("\tpivotIndex = " + pivotIndex);
        quickSort(a,start, pivotIndex-1);
        quickSort(a, pivotIndex+1, end);



    }

    static int partition(int[] a, int start, int end) {
        int pivotIndex = start;
        int pivot = a[start];

        for (int i = start+1;i <= end; i++) {
            if(a[i] < pivot) {
                if (pivotIndex+1 == i) {
                    int temp = a[i];
                    a[i] = pivot;
                    a[pivotIndex] = temp;
                } else {
                    int temp = a[pivotIndex+1];
                    a[pivotIndex+1] = pivot;
                    a[pivotIndex] = a[i];
                    a[i] = temp;
                }
                pivotIndex++;
            }

        }


        return pivotIndex;
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
