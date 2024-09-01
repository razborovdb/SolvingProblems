package amazon.subsets2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets2 {
    public static void main(String[] args) {
        // [[],[1],[1,2],[1,2,2],[2],[2,2]]
        int arr[] = {1,2,2};
        List<List<Integer>> result = subsetsWithDup(arr);

        for (List<Integer> list: result) {
            for(int i : list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums,0, new ArrayList<Integer>(), result);
        return result;

    }

    public static void permutation(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) {
                continue;
            }
            current.add(nums[i]);
            permutation(nums, i+1, current, result);
            current.remove(current.size()-1);
        }
    }
}
