package org.bloomtech.bd.codealong;

public class TwoDimensionalArray {

    public int[][] solution(int size) {
        //
        int[][] result = new int[size][size];
        for (int i =0;i< size;i++) {
            result[i][i] = 1;
        }

        return result;
    }
}
