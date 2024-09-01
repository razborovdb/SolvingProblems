package org.sort.mergesort;

public class MergeSort {
    static int[] solution(int[] a) {
        if(a == null) return null;
        if (a.length == 0) return a;

        mergeSort(a, 0, a.length-1);

        return a;

    }

    static void mergeSort(int[] a, int left, int right) {
        if(left < right) {
            int middle = (left + right) / 2;
            mergeSort(a, left, middle);
            mergeSort(a, middle+1,right);

            merge(a,left,middle,right);

        }
    }

    static void merge(int[] a, int left, int middle, int right) {
        int numLeft = middle - left + 1;
        int numRight = right - middle;

        int[] subLeft = new int[numLeft];
        for (int i = 0; i < numLeft; i++) {
            subLeft[i] = a[left+i];
        }
        int[] subRight = new int[numRight];
        for (int i = 0; i < numRight; i++) {
            subRight[i] = a[middle+1+i];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while(i < numLeft && j < numRight) {
            if (subLeft[i] < subRight[j]) {
                a[k] = subLeft[i];
                i++;
            } else {
                a[k] = subRight[j];
                j++;
            }
            k++;
        }

        while(i < numLeft) {
            a[k] = subLeft[i];
            i++;
            k++;
        }

        while(j < numRight) {
            a[k] = subRight[j];
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
