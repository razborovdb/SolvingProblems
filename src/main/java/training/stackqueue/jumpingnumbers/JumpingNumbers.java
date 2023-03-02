package training.stackqueue.jumpingnumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JumpingNumbers {

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i < 10) {
                list.add(i);
            } else {
                if (check(i)) {
                    list.add(i);
                }
            }
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = Integer.toString(o1);
                String s2 = Integer.toString(o2);

                Integer i1 = Integer.parseInt(s1.substring(0,1));
                Integer i2 = Integer.parseInt(s2.substring(0,1));
                return i1.compareTo(i2);
            }
        });

        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public static boolean check(int n) {
        int val = n;
        int prev = val % 10;

        while (val > 9) {
            val /= 10;
            if (Math.abs(prev - val % 10) != 1) return false;
            prev = val % 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sol = solution(40);
        // 0, 1, 10, 12, 2, 21, 23, 3, 32, 34, 4, 5, 6, 7, 8, 9,
        print(sol);
    }

    public static void print(int[] array) {
        for (int i: array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
