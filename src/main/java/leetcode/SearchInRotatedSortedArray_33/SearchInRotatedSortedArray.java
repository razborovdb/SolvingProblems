package leetcode.SearchInRotatedSortedArray_33;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < nums[i]) {
                if (nums[mid] < target && nums[j] >= target) i = mid+1;
                else j = mid-1;
            } else {
                if (nums[mid] > target && nums[i] <= target) j = mid-1;
                else i = mid+1;
            }

        }

        return -1;

    }
}
