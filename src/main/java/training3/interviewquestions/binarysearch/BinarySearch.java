package training3.interviewquestions.binarysearch;

public class BinarySearch {

    public static int solution(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if(nums[middle] == target) {
                return middle;
            }
            if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return -1;
    }

    public static int recursionSolution(int[] nums, int target) {

        return recursion(nums, 0, nums.length-1, target);
    }

    public static int recursion(int[] nums, int start, int end, int target) {
        if(start > end) return -1;
        int middle = (start+end)/2;
        if (nums[middle] == target) return middle;

        if (nums[middle] > target) return recursion(nums, start, middle-1, target);
        else return recursion(nums, middle+1, end,target);
    }
    public static void main(String[] args) {
        int[] nums = new int[] {23,45,6578,7896, 98765};
        int targetValue = 98765 ;
        System.out.println(solution(nums, targetValue));
        System.out.println();
        System.out.println(recursionSolution(nums, targetValue));
    }
}
