package codesignal.d01112023.task3;

public class Task3 {


    static int[][] solution(boolean[][] field, int x, int y) {
        int[][] result = new int[field.length][field[0].length];
        int[][] mine = new int[field.length][field[0].length];
        boolean[][] isVisited = new boolean[field.length][field[0].length];
        for (int i = 0; i < field.length; i++) {
            for (int j=0; j < field[0].length; j++) {
                result[i][j] = -1;
                mine[i][j] = calcMine(field, i, j);
            }
        }

        openCell(result,  mine, isVisited, x, y);

        print(mine);

        System.out.println();

        print(result);
        return result;
    }

    static void openCell(int[][] result, int[][] mine, boolean[][] isVisited, int x, int y) {
        if (isVisited[x][y]) return;
        isVisited[x][y] = true;
        result[x][y] = mine[x][y];
        if (mine[x][y] == 0) {
            for (int i = x - 1; i <= x + 1; i++) {
                if (i < 0) continue;
                if (i > result.length - 1) continue;
                for (int j = y - 1; j <= y + 1; j++) {
                    if (j < 0) continue;
                    if (j > result[0].length - 1) continue;
                    if (i == x && j == y) continue;
                    if (isVisited[i][j]) continue;
                    openCell(result, mine, isVisited, i, j);
                }
            }
        }
    }

    static int calcMine(boolean[][] field, int x, int y) {
        int count = 0;
        for (int i = x-1; i <= x+1; i++) {
            if (i < 0) continue;
            if (i > field.length-1) continue;
            for (int j = y-1; j <= y+1; j++) {
                if (j < 0) continue;
                if (j > field[0].length-1) continue;
                if (i==x && j == y) continue;
                if (field[i][j] == true) count++;

            }

        }
        return count;
    }

    public static void main(String[] args) {
        boolean[][] field = new boolean[][] {
                {true, false, true, true, false},
                {true, false, false, false, false},
                {false, false, false, false, false},
                {true, false, false, false, false}
        };

        int[][] result = solution(field, 3,2);

    }

    static void print(int[][] result) {
        for (int[] i: result) {
            for (int j : i) {
                System.out.print(j + "; ");
            }
            System.out.println();
        }
    }

}
