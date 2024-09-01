package amazon.coinchange;

import java.util.Arrays;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 1, dp.length, amount + 1);
        for (final int coin : coins)
            for (int i = coin; i <= amount; ++i)
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        // 3
        int[] nums = {1,2,5};
        System.out.println(coinChange(nums, 11));
    }
}
