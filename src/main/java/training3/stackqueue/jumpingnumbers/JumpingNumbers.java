package training3.stackqueue.jumpingnumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JumpingNumbers {

    public static void main(String[] args) {
        int[] sol = solution(40);
        // 0, 1, 10, 12, 2, 21, 23, 3, 32, 34, 4, 5, 6, 7, 8, 9,
        print(sol);
    }

    public static int[] solution(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            if (i < 10) {
                list.add(i);
                continue;
            }

            if (check(i)) {
                list.add(i);
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

    public static boolean check(int i) {
        int prevNumber = i % 10;
        while (i > 9) {
            i /= 10;
            int curNumber = i % 10;
            if (Math.abs(curNumber-prevNumber) != 1) {
                return false;
            }
            prevNumber = curNumber;
        }

        return true;
    }

    public static void print(int[] array) {
        for (int i: array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
