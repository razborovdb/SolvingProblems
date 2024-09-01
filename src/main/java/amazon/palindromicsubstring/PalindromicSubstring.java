package amazon.palindromicsubstring;

public class PalindromicSubstring {
    public static int countSubstrings(String s) {
        if (s.length() == 1) return 1;
        int n = s.length();
        int result = 0;
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            m[i][i] = 1;
            result++;
        }
        for (int col = 1; col < n; col++) {
            for(int row = 0; row < col; row++) {
                if (row == col-1 && s.charAt(col) == s.charAt(row)) {
                    m[row][col] = 1;
                    result++;
                } else if (m[row+1][col-1] == 1 && s.charAt(col) == s.charAt(row)) {
                    m[row][col] = 1;
                    result++;
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        // 6
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
}
