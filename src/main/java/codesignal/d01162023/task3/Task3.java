package codesignal.d01162023.task3;

public class Task3 {

    public static void main(String[] args) {
        int[][] field = new int[][] {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
                {1, 0, 0},
                {1, 1, 0}
        };
        int[][] figure = new int[][] {
                {0, 0, 1},
                {0, 1, 1},
                {0, 0, 1}
        };
        //System.out.println(solution(field, figure));
        ////////////////////////////////////////////////////////
        field = new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0},
                {1, 0, 1, 0, 1}
        };
        figure = new int[][] {
                {1, 1, 1},
                {1, 0, 1},
                {1, 0, 1}
        };

        ////////////////////////////////////////////////////////
        field = new int[][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1},
                {1, 1, 0, 1}
        };
        figure = new int[][] {
                {1, 1, 0},
                {1, 0, 0},
                {1, 0, 0}
        };

        System.out.println(solution(field, figure));




    }

    public static void print(int[][] nums) {
        for (int i[]: nums) {
            for (int j: i) {
                System.out.print(j + "; ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int solution(int[][] field, int[][] figure) {
        int[] fieldColDepth = new int[field[0].length];
        int[] figureColDepth = new int[figure[0].length];
        int[][] testMatrix = new int[field.length][field[0].length];
        int maxCount = 0;
        int dropIndex = -1;

        for (int j = 0; j < field[0].length; j++) {
            int depth = -1;
            for (int i = 0; i < field.length; i++) {
                if (field[i][j] == 1) {
                    depth = i;
                    break;
                }
            }
            fieldColDepth[j] = depth;
        }
        for (int j = 0; j < figure[0].length; j++) {
            int depth = -1;
            for (int i = 0; i < figure.length; i++) {
                if (figure[i][j] == 1) {
                    depth = i;
                }
            }
            figureColDepth[j] = depth;
        }

        for (int j = 0; j <= field[0].length - figure[0].length; j++) {
            int startRow = -1;
            for (int i = 0; i < figureColDepth.length; i++) {
                if (figureColDepth[i] == -1 || fieldColDepth[i+j] == -1) {
                    continue;
                }
                int val = fieldColDepth[i+j] - figureColDepth[i] - 1;
                if (val >= 0) {
                    if (startRow == -1) {
                        startRow = val;
                    }
                    if (val < startRow) {
                        startRow = val;
                    }
                }
            }
            if (startRow == -1) {
                startRow = field.length - figure.length;
            }

            for (int ii = 0; ii < field.length; ii++) {
                for (int jj = 0; jj < field[0].length; jj++) {
                    testMatrix[ii][jj] = field[ii][jj];
                    if (ii >= startRow && ii < startRow + figure.length && jj >= j && jj < j + figure[0].length) {
                        testMatrix[ii][jj] = testMatrix[ii][jj] | figure[ii- startRow][jj-j];
                    }
                }
            }
            print(testMatrix);
            int curCount = 0;

            for (int ii = 0; ii < field.length; ii++) {
                boolean b = true;
                for (int jj = 0; jj < field[0].length; jj++) {

                    if (testMatrix[ii][jj] == 0) {
                        b = false;
                        break;
                    }


                }
                if (b) {
                    curCount++;

                }
            }

            if (curCount > maxCount) {
                maxCount = curCount;
                dropIndex = j;
            }

        }
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        return dropIndex;
    }
}
