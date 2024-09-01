package amazon.wordsearch;

public class WordSearch {

    public static void main(String[] args)
    {
        char grid[][] = { "axmy".toCharArray(),
                "bgdf".toCharArray(),
                "xeet".toCharArray(),
                "raks".toCharArray() };

        // Function to check if word exists or not
        if (exist(grid, "abgeaks"))
            System.out.print("Yes");
        else
            System.out.print("No");
    }


    public static boolean exist(char[][] board, String word) {
        int n  = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (findWord(board, word, i, j, n, m, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean findWord(char[][] board, String word, int row, int col, int n, int m, int numCheckChar) {
        int l = word.length();
        if (l == numCheckChar) return true;
        if (row < 0 || col < 0 || row >= n || col >= m) return false;
        if(board[row][col] != word.charAt(numCheckChar)) {
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '#';
        boolean res = (findWord(board, word, row, col+1, n, m, numCheckChar + 1)) |
                (findWord(board, word, row, col-1, n, m, numCheckChar + 1))
                | (findWord(board, word, row+1, col, n, m, numCheckChar + 1))
                | (findWord(board, word, row-1, col, n, m, numCheckChar + 1));
        board[row][col] = temp;
        if(res) return true;
        return false;
    }
}
