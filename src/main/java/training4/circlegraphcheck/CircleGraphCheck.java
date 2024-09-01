package training4.circlegraphcheck;

import java.util.HashSet;
import java.util.Set;

public class CircleGraphCheck {

    public static boolean solution(int[][] c) {
        for (int i=0; i < c.length; i++) {
            if (dft(c, i, new HashSet<Integer>())) return true;
        }
        return false;
    }


    public static boolean dft(int[][] c, int start, Set<Integer> nodes) {
        if (nodes.contains(start)) return true;
        Set<Integer> newNodes = new HashSet<>(nodes);
        newNodes.add(start);

        for (int i: c[start]) {
            if (dft(c,i,newNodes)) return true;
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
