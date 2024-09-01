package leetcode.ValidSudoku;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = new char[][] {
                {'5','3','.','.','7','.','1','.','.'}
                ,{'6','.','.','.','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        };
        //System.out.println(isValidSudoku(board));

        board = new char[][] {  {'.','.','.','.','5','.','.','1','.'},
                                {'.','4','.','3','.','.','.','.','.'},
                                {'.','.','.','.','.','3','.','.','1'},
                                {'8','.','.','.','.','.','.','2','.'},
                                {'.','.','2','.','7','.','.','.','.'},
                                {'.','1','5','.','.','.','.','.','.'},
                                {'.','.','.','.','.','2','.','.','.'},
                                {'.','2','.','9','.','.','.','.','.'},
                                {'.','.','4','.','.','.','.','.','.'}
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Map<Integer, Integer> rc = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            rows.clear();
            cols.clear();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int val = Integer.parseInt(String.valueOf(board[i][j]));
                    if (rows.containsKey(val)) {
                        return false;
                    }
                    rows.put(val,1);
                }
                if (board[j][i] != '.') {
                    int val = Integer.parseInt(String.valueOf(board[j][i]));
                    if (cols.containsKey(val)) {
                        return false;
                    }
                    cols.put(val,1);
                }
            }
        }
        //
        for (int i = 0; i < 9; i+=3) {

            for (int j = 0; j < 9; j+=3  ) {
                rc.clear();
                for (int k = 0; k < 3; k++ ) {
                    if (board[i][j + k] != '.') {
                        int val = Integer.parseInt(String.valueOf(board[i ][j + k]));
                        if (rc.containsKey(val)) {
                            return false;
                        }
                        rc.put(val, 1);
                    }
                    if (board[i + 1][j + k] != '.') {
                        int val = Integer.parseInt(String.valueOf(board[i + 1][j + k]));
                        if (rc.containsKey(val)) {
                            return false;
                        }
                        rc.put(val, 1);
                    }
                    if (board[i + 2][j + k] != '.') {
                        int val = Integer.parseInt(String.valueOf(board[i + 2][j + k]));
                        if (rc.containsKey(val)) {
                            return false;
                        }
                        rc.put(val, 1);
                    }

                }
            }
        }
        return true;
    }
}
