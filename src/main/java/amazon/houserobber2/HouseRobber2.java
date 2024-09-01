package amazon.houserobber2;

import java.util.Arrays;

public class HouseRobber2 {

    public static int rob2(int nums[]) {
        if (nums == null) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] newArray1 = Arrays.copyOfRange(nums,1, nums.length);
        int[] newArray2 = Arrays.copyOfRange(nums,0, nums.length-1);
        return Math.max(rob(newArray1), rob(newArray2));
    }

    public static int rob(int nums[]) {
        if (nums == null) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int rob1 = nums[0];
        int rob2 = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int newRob = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = newRob;
        }
        return rob2;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob2(nums));
    }
}
