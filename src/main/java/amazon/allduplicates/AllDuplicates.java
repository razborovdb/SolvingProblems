package amazon.allduplicates;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i: nums) {
            int index = Math.abs(i) - 1;
            int temp = nums[index];
            if (temp < 0) {
                list.add(Math.abs(i));
            } else {
                nums[index] = -temp;
            }
        }

        return list;

    }

    public static void main(String[] args) {
        int[] nums = new int[] {4,3,2,7,8,2,3,1};

        List<Integer> list = findDuplicates(nums);

        for (int i : list) {
            System.out.print(i + ", ");
        }
    }
}
