package amazon.permutations2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        permutation(nums, new boolean[nums.length], new ArrayList<Integer>(), result);
        return result;
    }

    public static void permutation(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<Integer>(current));
            return;
        }
        for (int i=0; i < nums.length; i++) {
            if(used[i]) continue;
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;

            current.add(nums[i]);
            used[i] = true;
            permutation(nums,used,current, result);
            used[i] = false;
            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args) {
        // [[1,1,2],
        // [1,2,1],
        // [2,1,1]]
        int arr[] = {1,1,2};
        List<List<Integer>> result = permuteUnique(arr);

        for (List<Integer> list: result) {
            for(int i : list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
    }
}
