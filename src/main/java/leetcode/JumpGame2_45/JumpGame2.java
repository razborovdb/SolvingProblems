package leetcode.JumpGame2_45;

import java.util.ArrayList;
import java.util.List;

public class JumpGame2 {

    public static void main(String[] args) {
        int[] nums = new int[] {2,3,4,5};

        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int ans = 0, mx = 0, last = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            mx = Math.max(mx, i + nums[i]);
            if (last == i) {
                ++ans;
                last = mx;
            }
        }
        return ans;
    }

}
