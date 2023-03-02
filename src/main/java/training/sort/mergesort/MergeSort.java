package training.sort.mergesort;

public class MergeSort {
    public static void solution(int[] a) {
        mergeSort(a, 0, a.length-1);
    }

    public static void  mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int middle = (left+right) / 2;
            mergeSort(a, left, middle);
            mergeSort(a,middle+1, right);

            merge(a, left, middle, right);
        }


    }

    public static void merge(int[] a, int left, int middle, int right) {
        int nLeft = middle - left + 1;
        int nRight = right - middle;
        int[] aLeft = new int[nLeft];
        int[] aRight = new int[nRight];
        for (int i = 0; i < nLeft; i++) {
            aLeft[i] = a[left+i];
        }
        for (int i = 0; i < nRight; i++) {
            aRight[i] = a[middle+i+1];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < nLeft && j < nRight) {
            if (aLeft[i] < aRight[j]) {
                a[k] = aLeft[i];
                i++;
            } else {
                a[k] = aRight[j];
                j++;
            }
            k++;
        }

        while (i<nLeft) {
            a[k] = aLeft[i];
            i++;
            k++;
        }

        while (i<nRight) {
            a[k] = aRight[j];
            j++;
            k++;
        }

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
