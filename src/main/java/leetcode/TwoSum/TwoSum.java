package leetcode.TwoSum;

public class TwoSum {
    public static void main(String[] args) {
        // answer 0, 1
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int i: result) {
            System.out.print(i + ", ");
        }



    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j=i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    result[0] =i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
