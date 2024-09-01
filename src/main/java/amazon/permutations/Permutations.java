package amazon.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums, new boolean[nums.length], new ArrayList<Integer>(), result);
        return result;
    }

    public static void permutation(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result ) {
        if (current.size() == nums.length) {
            result.add(new ArrayList(current));
        }
        for (int i=0; i < nums.length;i++) {
            if(used[i]) continue;

            used[i] = true;
            current.add(nums[i]);
            permutation(nums, used, current, result);
            current.remove(current.size()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        // [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        int arr[] = {1,2,3};
        List<List<Integer>> result = permute(arr);

        for (List<Integer> list: result) {
            for(int i : list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
    }
}
