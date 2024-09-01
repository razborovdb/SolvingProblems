package amazon.partitiontokequalsumsubsets;

public class PartitionToKEqualSumSubsets {

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        if (sum % k != 0) return false;

        return canPartition(nums, 0, k, sum / k, sum /k, new boolean[nums.length]);
    }

    public static boolean canPartition(int[] nums, int start, int k, int curTargetSum, int targetSum, boolean[] used) {
        if (k == 0) {
            return true;
        }
        if (curTargetSum < 0) {
            return false;
        }
        if (curTargetSum == 0) {
            return canPartition(nums, 0, k-1, targetSum, targetSum, used);
        }

        for (int i = start; i < nums.length; i++) {
            if(used[i]) continue;
            used[i] = true;
            if (canPartition(nums, i+1, k, curTargetSum-nums[i], targetSum, used)) {
                return true;
            }
            used[i] = false;
        }
        return false;
    }
    public static void main(String[] args) {
        // true
        int arr[] = {4,3,2,3,5,2,1};
        System.out.println(canPartitionKSubsets(arr, 4));
    }
}
