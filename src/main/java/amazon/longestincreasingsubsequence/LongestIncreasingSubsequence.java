package amazon.longestincreasingsubsequence;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {


    public static int lengthOfLIS(int[] nums) {
        List<Integer> tail = new ArrayList<>();

        for (final int num : nums) {
            if (tail.isEmpty() || num > tail.get(tail.size() - 1))
                tail.add(num);
            else
                tail.set(firstGreaterEqual(tail, num), num);
        }

        return tail.size();
    }

    private static int firstGreaterEqual(List<Integer> A, int target) {
        int l = 0;
        int r = A.size();
        while (l < r) {
            final int m = (l + r) / 2;
            if (A.get(m) >= target)
                r = m;
            else
                l = m + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        // 6
        int[] nums = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }
}
