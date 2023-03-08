package leetcode.ThreeSum;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        //answer
//        -1; -1; 2;
//        -1; 0; 1;
        int[] nums = new int[] {-1,0,1,2,-1,-4};

        List<List<Integer>> l = threeSum(nums);

        for (List<Integer> ll: l) {
            for(Integer i: ll) {
                System.out.print(i +"; ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<String> setList = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i < nums.length; i++) {
            int j=i+1;
            int k=nums.length-1;


            while (j<k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    String s = Integer.toString(nums[i]) + " " + Integer.toString(nums[j]) + " " + Integer.toString(nums[k]);
                    if (!setList.contains(s)) {
                        setList.add(s);
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        result.add(l);
                    }
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0){
                        j++;

                } else {
                    k--;
                }
            }
        }

        return result;
    }
}
