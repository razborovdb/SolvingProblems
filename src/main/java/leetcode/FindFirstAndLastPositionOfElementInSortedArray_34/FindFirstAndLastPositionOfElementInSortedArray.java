package leetcode.FindFirstAndLastPositionOfElementInSortedArray_34;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] {5,7,7,8,8,10};
        int target = 8;

        int[] result = searchRange(nums, target);

        Arrays.stream(result).forEach(value -> System.out.println(value + "; "));
    }

    public static int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        int start = -1;
        int stop = -1;

        if (nums.length == 0) {
            return new int[] {start, stop};
        }

        while (i<=j ) {
            int mid = (i+j) / 2;
            if (nums[mid] == target) {
                start = findStart(nums, i, mid, target);
                stop = findStop(nums, mid, j, target);
                break;
            }
            if (nums[mid] < target) {
                i = mid+1;
            } else {
                j = mid - 1;
            }
        }

        return new int[] {start, stop};
    }

    public static int findStart(int[] nums, int strt, int stp, int target) {
        int i = strt;
        int j = stp;
        int minIndex = stp;
        while ( i<=j ) {
            int mid = (i+j)/2;
            if (nums[mid] == target) {
                minIndex = mid;
                j = mid-1;
            } else {
                i = mid + 1;
            }
        }

        return minIndex;
    }
    public static int findStop(int[] nums, int strt, int stp, int target) {
        int i = strt;
        int j = stp;
        int maxIndex = stp;
        while ( i<=j ) {
            int mid = (i+j)/2;
            if (nums[mid] == target) {
                maxIndex = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return maxIndex;
    }
}
