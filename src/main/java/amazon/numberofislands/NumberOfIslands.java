package amazon.numberofislands;

public class NumberOfIslands {

    public static int[][] dir = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    public static int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != '1') {
                    continue;
                }
                dfs(grid,i,j);
                result++;
            }
        }
        return result;
    }

    public static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return;
        }
        if(grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '2';
        for (int[] d : dir) {
            dfs(grid, i + d[0], j + d[1]);
        }
    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

        System.out.println(numIslands(grid));
    }
    public static void printMatrix(char[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                System.out.print(m[i][j] + "; ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
