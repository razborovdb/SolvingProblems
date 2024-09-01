package leetcode.NextPermutation_31;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = new int[] {3,1,2};

        nextPermutation(nums);

        Arrays.stream(nums).forEach(i -> System.out.print(i + "; "));
    }

    static void reverse (int[] nums, int start, int end) {
        while (start < end) {
            swap(nums,start, end);
            start++;
            end--;
        }
    }

    static void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void nextPermutation(int[] nums) {
        if (nums.length < 2) return;

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }


        int needSwap = i;

        reverse(nums, i+1, nums.length - 1);


        if (i >= 0) {
            while(i < nums.length-1 && nums[i] <= nums[needSwap]) {

                i++;
            }
            swap(nums,needSwap,i);
        }

    }
}
