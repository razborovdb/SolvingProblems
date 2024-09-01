package amazon.pacificatlanticwaterflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public static int[][] dir = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int n = heights.length;
        int m = heights[0].length;
        boolean[][] atlantic = new boolean[n][m];
        boolean[][] pacific = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            dfs(heights, i, m-1, Integer.MIN_VALUE, atlantic);
            dfs(heights, i, 0, Integer.MIN_VALUE, pacific);
        }

        for (int i = 0; i < m; i++) {
            dfs(heights, n-1, i, Integer.MIN_VALUE, atlantic);
            dfs(heights, 0, i, Integer.MIN_VALUE, pacific);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (atlantic[i][j] && pacific[i][j]) {
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }

    public static void dfs(int[][] heights, int i, int j, int prev, boolean[][] ocean) {
        if (i < 0 || i >= heights.length || j < 0 || j >= heights[0].length) {
            return;
        }

        if (heights[i][j] < prev || ocean[i][j]) {
            return;
        }
        ocean[i][j] = true;

        for (int[] d : dir) {
            dfs(heights, i + d[0], j + d[1], heights[i][j], ocean);
        }
    }

    public static void main(String[] args) {
        // [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
        //int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        // [[0,2],[1,0],[1,1],[1,2],[2,0],[2,1],[2,2]]
        int[][] heights = {{1,2,3},{8,9,4},{7,6,5}};
        List<List<Integer>> result = pacificAtlantic(heights);

        for (List<Integer> list : result) {
            for (int i: list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }

    }

    public static void printMatrix(boolean[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                int val = 0;
                if (m[i][j]) {
                    val = 1;
                }

                System.out.print(val + "; ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                System.out.print(m[i][j] + "; ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
