package amazon.combinationsum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(1, k,n, new ArrayList<>(), result) ;
        return result;
    }
    public static void permutation(int index, int k, int target, List<Integer> current, List<List<Integer>> result) {
        if (target < 0) return;
        if (current.size() > k) return;
        if (target == 0 ) {
            if (current.size() == k) {
                result.add(new ArrayList<Integer>(current));
            }
            return;
        }
        for (int i = index; i < 10; i++) {
            current.add(i);
            permutation(i+1, k,target-i, current, result) ;
            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args) {
        // [[1,2,6],[1,3,5],[2,3,4]]

        List<List<Integer>> result = combinationSum3(3, 9);

        for (List<Integer> list: result) {
            for(int i : list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
    }
}
