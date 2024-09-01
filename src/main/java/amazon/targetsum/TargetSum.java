package amazon.targetsum;

public class TargetSum {
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        if(sum < Math.abs(target) || (sum + target) % 2 == 1) return 0;
        return findTarget(nums, (target + sum) / 2);
    }

    public static int findTarget(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int num: nums) {
            for (int i = target; i >= num; i--) {
                dp[i] += dp[i-num];
            }
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        // 9
        int arr[] = {1,1,1,1,1};
        System.out.println(findTargetSumWays(arr, 3));
    }
}
