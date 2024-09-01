package training6.sort.mergesort;

public class MergeSort {


    public static void solution(int[] a) {
        mergeSort(a, 0, a.length - 1);

    }

    public static void mergeSort(int[] a, int start, int end) {
        if ((end - start) < 1) return;
        int middle = (start + end) / 2;

        mergeSort(a, start, middle);
        mergeSort(a, middle + 1, end);

        merge(a, start, middle, end);

    }

    public static void merge(int[] a, int start, int middle, int end) {
        int leftL = middle - start + 1;
        int rightL = end - middle;
        int[] left = new int[leftL];
        int[] right = new int[rightL];

        for (int i = 0; i < leftL; i++) {
            left[i] = a[i + start];

        }

        for (int i = 0; i < rightL; i++) {
            right[i] = a[i + middle + 1];

        }

        int i = 0;
        int j = 0;
        int k = start;
        while (i < leftL && j < rightL) {
            if (left[i] > right[j]) {
                a[k] = right[j];
                j++;
            } else {
                a[k] = left[i];
                i++;
            }
            k++;
        }
        while (i < leftL) {
            a[k] = left[i];
            i++;
            k++;
        }

        while (j < rightL) {
            a[k] = right[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{81, 82, 5, 21, 46, 74, 73, 97, 53, 23};
        solution(a);
        print(a);
    }

    static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
