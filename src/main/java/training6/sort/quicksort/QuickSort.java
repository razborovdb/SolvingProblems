package training6.sort.quicksort;

public class QuickSort {

    public static void solution(int[] a) {
        partition(a, 0, a.length-1);
    }


    public static void partition(int[] a, int start, int end) {
        if (start > end) return;

        int pivotIndex = pivotPosition(a, start,end);

        partition(a, start,pivotIndex-1);
        partition(a,pivotIndex+1, end);
    }


    public static int pivotPosition(int[] a, int start, int end) {
        int pivotIndex = start;
        int pivot = a[start];
        for (int i = start+1; i <= end; i++) {
            if (pivot > a[i]) {
                if (pivotIndex + 1 == i) {
                    int temp = a[i];
                    a[i] = pivot;
                    a[pivotIndex] = temp;
                } else {
                    int temp = a[i];
                    a[i] = a[pivotIndex+1];
                    a[pivotIndex+1] = pivot;
                    a[pivotIndex] = temp;
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
