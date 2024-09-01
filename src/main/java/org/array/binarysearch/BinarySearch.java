package org.array.binarysearch;

public class BinarySearch {
    static int solution(int[] nums, int target) {
        int start = 0;
        int end =  nums.length-1;
        return binarySearch(nums, start, end, target);
    }
    static int binarySearch(int[] nums, int start, int end, int target) {
        if (end<start) return -1;
        int middle = (start+end) / 2;

        if (nums[middle] == target) return middle;
        if (target > nums[middle]) return binarySearch(nums, middle+1, end, target);
        if (target < nums[middle]) return binarySearch(nums, start, middle-1, target);

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {23,45,6578,7896, 98765};
        System.out.println(solution(nums, 5));
    }

}
