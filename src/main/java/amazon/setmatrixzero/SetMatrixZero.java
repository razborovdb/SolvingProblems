package amazon.setmatrixzero;

import java.util.Hashtable;

public class SetMatrixZero {
    public static void setZeros(int[][] matrix)
    {

        boolean firstLine = false;
        boolean firstColumn = false;
        for(int i = 0; i < matrix.length;i++) {
            if (matrix[i][0] == 0) {
                firstColumn = true;
            }
        }
        for(int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                firstLine = true;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstLine) {
            for(int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;

            }
        }

        if (firstColumn) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String args[])
    {

        int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 0 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 0 }, { 1, 0, 1, 1, 0 } };

        setZeros(arr);
    }

}
