package leetcode.CombinationSum_40;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> answer = combinationSum2(candidates, target);
        for(List<Integer> list: answer) {
            for(Integer i: list) {
                System.out.print(i+"; ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(candidates);
        findSum(candidates, target,0, set, new ArrayList<Integer>());
        return set;
    }
    public static void findSum(int[] candidates, int target, int index, List<List<Integer>> set, List<Integer> temp) {
        if (target == 0) {

                set.add(new ArrayList<>(temp));

        }
        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (target - candidates[i] >= 0) {
                temp.add(candidates[i]);
                findSum(candidates, target - candidates[i], i+1, set, temp);
                temp.remove((Integer) candidates[i]);
            }
        }
    }


    public static void printSet(Set<List<Integer>> set) {
        for (List<Integer> list: set) {
            System.out.println(list.size());
            for (int i: list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
