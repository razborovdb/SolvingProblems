package remotask.rod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Curplus {

    public static void main(String[] args) {


        int[] length = new int[] {30, 59,110};

        int cost_per_cut = 1;
        int sale_price = 10;


        System.out.println(calculateMaximumProfit(cost_per_cut, sale_price, length));
    }

    public static long calculateMaximumProfit(int cost_per_cut, int metal_price, int[] lengths) {

        long maxProfit = 0;

        Arrays.sort(lengths);
        // Find out maximum length
        int minLength = lengths[0];

        for (int i = 1; i <= minLength; i++) {
            int numCuts = 0;
            int numRegular = 0;
            for (int nextL: lengths) {
                numRegular += nextL / i;
                if (nextL % i == 0) {
                    numCuts += nextL / i  - 1;
                } else {
                    numCuts += nextL / i;
                }
            }

            int profit = (metal_price * i * numRegular - numCuts * cost_per_cut);
            maxProfit = Math.max(maxProfit, profit);

        }

        return maxProfit;
    }
}
