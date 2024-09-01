package training.array.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[] {23,45,6578,7896, 98765};
        int targetValue = 23 ;
        System.out.println(solution(nums, targetValue));
        System.out.println();
        System.out.println(recursionSolution(nums, targetValue));
    }


    public static int solution(int[] nums, int targetValue) {
        int start = 0;
        int end = nums.length-1;
        int middle = (end + start) / 2;
        while (end >= start) {
            middle = (end + start) / 2;
            if (nums[middle] == targetValue) {
                return middle;
            }
            if (targetValue > nums[middle]) {
                start = middle+1;

            } else {
                end = middle-1;
            }
        }
        return -1;
    }

    public static int recursionSolution(int[] nums, int targetValue) {


        return recursion(nums, 0, nums.length-1, targetValue);
    }

    public static int recursion(int[] nums, int start, int end, int targetValue) {
        if (end < start) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (nums[middle] == targetValue) {
            return middle;
        }
        if (nums[middle] < targetValue) {
            return recursion(nums, middle + 1, end, targetValue);
        } else {
            return recursion(nums, start, middle - 1, targetValue);
        }
    }

}
