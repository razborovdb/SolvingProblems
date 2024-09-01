package jpmorgan.coins.Coins;

import java.util.Arrays;
import java.util.List;

public class Coins {
    public static void main(String[] args) {
        int[] coins = new int[] {1, 3, 6};
        int sum = 24;
        System.out.println(numCoins2(coins, sum));

    }

    public static int numCoins(int[] coins, int sum) {
        int result = 0;
        for (int i = coins.length-1; i >= 0; i--) {
            int nextCoin = sum / coins[i];
            result += nextCoin;
            sum = sum - nextCoin * coins[i];

            if (sum <= 0) {
                break;
            }
        }

        return result;
    }

    public static int numCoins2(int[] coins, int sum) {
        int result = 0;
        for (int i = coins.length-1; i >= 0; i--) {
            int nextCoin = sum / coins[i];
            result += nextCoin;
            sum = sum % coins[i];

            if (sum == 0) {
                break;
            }
        }

        return result;
    }
}
