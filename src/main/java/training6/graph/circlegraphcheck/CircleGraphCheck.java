package training6.graph.circlegraphcheck;

import java.util.HashSet;
import java.util.Set;

public class CircleGraphCheck {
    public static boolean solution(int[][] c) {
        boolean[] isVisited = new boolean[c.length];

        for(int i = 0; i < c.length; i++) {

            if (dft(c, i, new HashSet<>())) return true;

        }
        return false;

    }


    public static boolean dft(int[][] c, int start, Set<Integer> visited) {
        if(visited.contains(start)) return true;
        Set<Integer> newVisited = new HashSet<>(visited);
        newVisited.add(start);
        for(int i: c[start]) {
            if (dft(c, i, newVisited)) return true;
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
