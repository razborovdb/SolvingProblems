package training.matrix;

public class Matrix {
    public static void transposeMatrixMain(int[][] m) {
        for (int i=0; i< m.length; i++) {
            for (int j=i; j< m.length; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }
    public static void transposeMatrixBack(int[][] m) {
        for (int i=0; i< m.length; i++) {
            for (int j=m.length - 1 - i; j>=0; j--) {
                int temp = m[i][j];
                m[i][j] = m[m.length - 1 - j][m.length - 1 - i];
                m[m.length - 1 - j][m.length - 1 - i] = temp;
            }
        }
    }
    public static void changeMatrixPlace(int[][] m) {
        for (int i=0; i< m.length/2; i++) {
            for (int j = 0; j < m.length; j++) {
                int temp = m[i][j];
                m[i][j] = m[m.length - 1 - i][j] ;
                m[m.length - 1 - i][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] m = new int[][] {{1,2,3,4,5}, {6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printMatrix(m);
        //transposeMatrixMain(m);
        transposeMatrixBack(m);

        System.out.println();
        printMatrix(m);

        changeMatrixPlace(m);
        System.out.println();
        printMatrix(m);
    }

    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
