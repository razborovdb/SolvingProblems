package leetcode.SearchInsertPosition_35;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));

    }
    public static int searchInsert(int[] nums, int target) {
        return searchPosition(nums, 0, nums.length - 1, target);
    }

    public static int searchPosition(int[] nums, int start, int end, int target) {
        if (start > end) return start;
        int middle = (start+end) / 2;
        if (nums[middle] == target) {
            return middle;
        }
        if (nums[middle] < target) {
            return searchPosition(nums, middle+1, end, target);
        }
        return searchPosition(nums, start, middle-1, target);
    }
}
