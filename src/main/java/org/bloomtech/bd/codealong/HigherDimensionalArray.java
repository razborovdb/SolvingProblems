package org.bloomtech.bd.codealong;

public class HigherDimensionalArray {

    public int solution(int[][][] arr, int row, int col){
        //
        int sum = 0;
        for (int i = 0; i < arr[row][col].length;i++) {
            sum += arr[row][col][i];
        }
        return sum;
    }
}
