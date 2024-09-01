package amazon.jumpgame;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length -1; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }

    public static void main(String[] args) {
        //true
        int[] nums = new int[] {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
