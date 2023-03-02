package org.array.linearsearch;

public class LinearSearch {
    int solution(int[] a, int value) {
        for (int i = 0; i < a.length;i++) {
            if (a[i] == value) return i;
        }
        return -1;
    }
}
