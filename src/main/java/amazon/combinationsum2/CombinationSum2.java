package amazon.combinationsum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        permutation(0, candidates,target, new ArrayList<>(), result) ;
        return result;
    }
    public static void permutation(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {
        if (target < 0) return;
        if (target == 0) {
            result.add(new ArrayList<>(current));
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i-1]) continue;
            current.add(candidates[i]);
            permutation(i+1, candidates,target-candidates[i], current, result) ;
            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args) {
        // [
        //[1,1,6],
        //[1,2,5],
        //[1,7],
        //[2,6]
        //]
        int candidates[] = {10,1,2,7,6,1,5};
        List<List<Integer>> result = combinationSum2(candidates, 8);

        for (List<Integer> list: result) {
            for(int i : list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
    }
}
