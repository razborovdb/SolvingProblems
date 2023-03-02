package training2.array.linearsearch;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = new int[] {23,45,6578,7896, 98765};
        int targetValue = 45;
        System.out.println(solution(nums, targetValue));
        System.out.println();
        System.out.println(recursionSolution(nums, targetValue));
    }

    public static int solution(int[] nums, int targetValue) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == targetValue) return i;
        }
        return -1;
    }

    public static int recursionSolution(int[] nums, int targetValue) {

        return recursion(nums, targetValue, 0);
    }

    public static int recursion(int[] nums, int targetValue, int cur) {
        if (cur >= nums.length) return -1;

        if (nums[cur] == targetValue) {
            return cur;
        }
        return recursion(nums, targetValue, cur+1);
    }
}
