package org.stackqueue.jumpingnumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JumpingNumbers {
    int[] solution(int x) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= x; i++) {
            if (checkInt(i)) {
                list.add(i);
            }
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                String s1 = Integer.toString(i1);
                String s2 = Integer.toString(i2);
                Integer f1 = Integer.parseInt(s1.substring(0,1));
                Integer f2 = Integer.parseInt(s2.substring(0,1));
                return f1.compareTo(f2);
            }
        });

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    public boolean checkInt(int i) {
        boolean result = true;
        int f = i % 10;
        int num = i / 10;

        while (num != 0) {
            if(Math.abs(f - (num % 10)) != 1) {
                result = false;
                break;
            }
            f = num % 10;
            num /= 10;
        }


        return result;
    }

    public static void main(String[] args) {
        JumpingNumbers jumpingNumbers = new JumpingNumbers();
        int[] sol = jumpingNumbers.solution(40);
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
