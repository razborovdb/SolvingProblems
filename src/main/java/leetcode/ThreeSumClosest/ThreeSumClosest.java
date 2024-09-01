package leetcode.ThreeSumClosest;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        //answer 2
        int[] nums = new int[] {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, 1));

    }

    public static int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length-1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < Math.abs(result-target) ) {
                    result = sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }



        return result;
    }
}
