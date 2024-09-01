package training6.interviewquestions.coins;

public class Coins {
    public static int numCoins(int[] coins, int sum) {
        int result = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            result += sum / coins[i];
            sum %= coins[i];
            if (sum <= 0) break;

        }
        System.out.println();
        return result;
    }
    public static void main(String[] args) {
        int[] coins = new int[] {1, 3, 6};
        int sum = 19;
        System.out.println(numCoins(coins, sum));
    }
}
