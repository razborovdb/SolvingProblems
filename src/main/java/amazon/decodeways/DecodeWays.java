package amazon.decodeways;

public class DecodeWays {

    public static int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        if (s.length() <= 1) return 1;

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        if (s.charAt(0) == '0') {
            return 0;
        } else {
            dp[1] = 1;
        }
        for (int i=2; i < dp.length; i++) {
            int next = s.charAt(i-1) - 48;
            int prev = s.charAt(i-2) - 48;
            if (next == 0) {
                if(prev == 1 || prev == 2) {
                    dp[i] += dp[i-2];
                } else {
                    return 0;
                }
            } else {
                if(prev == 1 || prev == 2 && next < 7) {
                    dp[i] += dp[i-1] + dp[i-2];
                } else {
                    dp[i] += dp[i-1];
                }
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        // 3
        String s = "226";

        System.out.println(numDecodings(s));
    }
}
