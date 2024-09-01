package training6.interviewquestions.binarysearch;

public class BinarySearch {

    public static int solution(int[] nums, int targetValue) {
        int result = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int middle = (start+end)/2;
            if (nums[middle] == targetValue) return middle;
            if(nums[middle] > targetValue) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }

        }

        return result;
    }

    public static int recursionSolution(int[] nums, int targetValue) {
        return recursion(nums, targetValue,0, nums.length - 1);
    }

    public static int recursion(int[] nums, int targetValue, int start, int end) {
        if (start > end) return -1;
        int middle = (start+end)/2;
        if (nums[middle] == targetValue) return middle;

        if(nums[middle] > targetValue) return recursion(nums, targetValue, start, middle-1);
        else return recursion(nums, targetValue, middle+1, end);



    }
    public static void main(String[] args) {
        int[] nums = new int[] {23,45,6578,7896, 98765};
        int targetValue = 6578 ;
        System.out.println(solution(nums, targetValue));
        System.out.println();
        System.out.println(recursionSolution(nums, targetValue));
    }
}
