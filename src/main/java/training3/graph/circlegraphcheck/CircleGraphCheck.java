package training3.graph.circlegraphcheck;

import java.util.HashSet;
import java.util.Set;

public class CircleGraphCheck {
    public static boolean solution(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            if (dft(c, i, new HashSet<>())) {
                return true;
            }
        }

        return false;
    }

    public static boolean dft(int[][] c, int start, Set<Integer> set) {
        if(set.contains(start)) return true;
        Set<Integer> newSet = new HashSet<>(set);
        newSet.add(start);
        for (int i : c[start]) {
            if (dft(c, i, newSet)) {
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        int[][] connections = new int[][] { {1}, {2}, {3,4}, {4}, {0} };
        System.out.println(solution(connections));

        connections = new int[][] { {1}, {2}, {3,4}, {4}, {} };
        System.out.println(solution(connections));
    }
}
