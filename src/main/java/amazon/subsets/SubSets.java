package amazon.subsets;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        // [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
        int arr[] = {1,2,3};
        List<List<Integer>> result = subsets(arr);

        for (List<Integer> list: result) {
            for(int i : list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int numSets = (int) Math.pow(2, nums.length);

        for (int i = 0; i < numSets; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j=0; j < nums.length; j++) {
                if(isInclude(i,j)) {
                    list.add(nums[j]);
                }
            }
            result.add(list);
        }

        return result;
    }

    public static boolean isInclude(int i, int j) {
        int check = 1 << j;
        check = i & check;
        if (check == 0) return false;
        return true;
    }
}
