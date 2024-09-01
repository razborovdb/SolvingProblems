package leetcode.CombinationSum_39;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> answer = combinationSum(candidates, target);
        for(List<Integer> list: answer) {
            for(Integer i: list) {
                System.out.print(i+"; ");
            }
            System.out.println();
        }

    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        findNumbers(candidates, target, 0, answer, new ArrayList<>());
        return answer;
    }

    public static void findNumbers(int[] candidates, int target, int index, List<List<Integer>> answer, List<Integer> temp) {
        if (target == 0) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (target - candidates[i] >= 0) {
                temp.add(candidates[i]);
                findNumbers(candidates, target - candidates[i], i, answer, temp);
                temp.remove((Integer) candidates[i]);
            }
        }
    }
}
