package amazon.partitionequalsubsetsum;

public class PartitionEqualSubsetSum {

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }

        sum /= 2;

        boolean[] dp = new boolean[sum+1];
        dp[0] = true;
        for (int num: nums) {
            for (int i = sum; i >= num; i--) {
                dp[i] = dp[i] | dp[i-num];
            }
        }

        return dp[sum];
    }
    public static void main(String[] args) {
        // true
        int[] nums = {1,5,13,7};
        System.out.println(canPartition(nums));
    }
}
