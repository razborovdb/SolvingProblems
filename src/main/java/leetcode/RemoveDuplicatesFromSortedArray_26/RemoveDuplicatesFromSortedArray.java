package leetcode.RemoveDuplicatesFromSortedArray_26;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        for (int i =0; i< k; i++) {
            System.out.print(nums[i] + "; ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;

        int prev = nums[0];
        int index = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != prev) {
                nums[index] = nums[i];
                prev = nums[i];
                index++;
            }
        }

        return index;

    }
}
