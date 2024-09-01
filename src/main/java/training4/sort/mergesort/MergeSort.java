package training4.sort.mergesort;

public class MergeSort {

    public static void solution(int[] a) {
        mergeSort(a,0, a.length - 1);
    }

    public static void mergeSort(int[] a, int start, int end) {
        if(start < end) {
            int middle = (start + end) / 2;
            mergeSort(a, start, middle);
            mergeSort(a, middle+1, end);

            merge(a, start, middle, end);
        }
    }


    public static void merge(int[] a, int start, int middle, int end) {

        int[] left = new int[middle - start + 1];
        int[] right = new int[end - middle];

        for(int i = 0; i <= middle - start; i++) {
            left[i] = a[start+i];
        }

        for(int i = 0; i < end - middle; i++) {
            right[i] = a[middle+i+1];
        }

        int iLeft = 0;
        int iRight = 0;
        int i = start;

        while(iLeft <= (middle-start) && iRight < (end - middle)) {
            if(left[iLeft] < right[iRight]) {
                a[i] = left[iLeft];
                iLeft++;
            } else {
                a[i] = right[iRight];
                iRight++;
            }
            i++;
        }

        while(iLeft <= middle-start) {
            a[i] = left[iLeft];
            iLeft++;
            i++;
        }

        while(iRight < end - middle) {
            a[i] = right[iRight];
            iRight++;
            i++;
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
