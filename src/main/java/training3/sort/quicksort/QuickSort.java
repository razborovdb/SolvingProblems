package training3.sort.quicksort;

public class QuickSort {

    public static void solution(int[] a) {
        quickSort(a, 0, a.length-1);
    }

    public static void quickSort(int[] a, int start, int end) {
        if (start >= end) return;
        int pivot = partition(a, start, end);
        quickSort(a,start, pivot - 1);
        quickSort(a, pivot + 1, end);
    }
    public static int partition(int[] a, int start, int end) {
        int pivotIndex = start;
        int pivot = a[pivotIndex];
        for (int i = start+1; i <= end; i++) {
            if (a[i] < pivot) {
                if (pivotIndex+1 == i) {
                    a[pivotIndex] = a[i];
                    a[i] = pivot;
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
