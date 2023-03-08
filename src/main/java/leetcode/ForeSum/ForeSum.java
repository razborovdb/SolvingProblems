package leetcode.ForeSum;

import java.util.*;

public class ForeSum {
    public static void main(String[] args) {
        //answer
        // [-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]

        int[] nums = new int[] {1,0,-1,0,-2,2};
        int target = 0;

        List<List<Integer>> l = fourSum(nums, target);

        for (List<Integer> ll: l) {
            for(Integer i: ll) {
                System.out.print(i +"; ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        long trg = target;

        Arrays.sort(nums);

        for (int i=0; i < nums.length - 3; i++) {
            for (int j=i+1; j < nums.length - 2; j++) {
                int k = j+1;
                int l = nums.length - 1;

                while (k < l) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];

                    if (sum == trg) {
                        String s = Integer.toString(nums[i]) + " " + Integer.toString(nums[j]) + " " + Integer.toString(nums[k]) + " "
                                + Integer.toString(nums[l]);
                        if(!stringSet.contains(s)) {
                            stringSet.add(s);
                            List<Integer> newList = new ArrayList<>();
                            newList.add(nums[i]);
                            newList.add(nums[j]);
                            newList.add(nums[k]);
                            newList.add(nums[l]);
                            result.add(newList);
                        }
                        k++;
                        l--;
                    } else if (sum < trg) {
                        k++;
                    } else {
                        l--;
                    }
                }

            }
        }


        return result;
    }
}
