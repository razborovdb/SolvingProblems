package amazon.besttimetobuyandsell;

public class BestTimeToBuyAndSell {

    public static int maxProfit(int[] prices) {
        int sell = 0;
        int hold = Integer.MIN_VALUE;
        int prev = 0;

        for (final int price : prices) {
            int cache = sell;
            sell = Math.max(sell, hold + price);
            hold = Math.max(hold, prev - price);
            prev = cache;
            System.out.println("sell = " + sell + "; hold = " + hold + "; prev = " + prev);
        }

        return sell;
    }

    public static void main(String[] args) {
        // 3
        int[] prices = new int[] {1,2,3,0,2};
        System.out.println(maxProfit(prices));
    }
}
