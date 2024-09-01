package amazon.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void makeSpiral(int[][] matrix, int i, int j, int m, int n, List<Integer> result) {
        if(i >= m || j >= n) {
            return;
        }
        for (int col = j; col < n; col++) {
            result.add(matrix[i][col]);
        }
        for (int row = i+1; row < m; row++) {
            result.add(matrix[row][n-1]);
        }
        if ((m-1) != i) {
            for (int col = n-2; col >= j; col--) {
                result.add(matrix[m-1][col]);
            }
        }
        if ((n-1) != j) {
            for (int row = m-2; row > i; row--) {
                result.add(matrix[row][j]);
            }
        }
        makeSpiral(matrix, i+1, j+1, m-1, n-1, result);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<Integer>();
        makeSpiral(matrix, 0, 0, m, n, result);
        return result;
    }

    public static void main(String[] args)
    {
        int[][] a = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // Function Call
        List<Integer> result = spiralOrder(a);

        for (int i: result) {
            System.out.print(i + "; ");
        }
    }

}
