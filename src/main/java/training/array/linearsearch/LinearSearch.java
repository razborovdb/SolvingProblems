package training.array.linearsearch;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = new int[] {23,45,6578,7896, 98765};
        System.out.println(solution(nums, 45));
        System.out.println();
        System.out.println(recursionSolution(nums, 0, 98766));
    }

    public static int solution(int[] nums, int targetValue) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }

    public static int recursionSolution(int[] nums, int i, int targetValue) {
        if (i >= nums.length) {
            return -1;
        }
        if (nums[i] == targetValue) {
            return i;
        }
        return recursionSolution(nums, i+1, targetValue);


    }
}
