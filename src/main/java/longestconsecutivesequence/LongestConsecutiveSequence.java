package longestconsecutivesequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums) {
            set.add(i);
        }
        int max = 0;
        for (int num: nums) {
            if(set.contains(num-1)) continue;

            int length = 1;
            while(set.contains(++num)) {
                length++;
            }
            max = Math.max(max, length);
        }

        return max;
    }
    public static void main(String[] args) {
        // 9
        int arr[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
}
