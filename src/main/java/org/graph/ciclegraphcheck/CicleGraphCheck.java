package org.graph.ciclegraphcheck;

import java.util.HashSet;

public class CicleGraphCheck {
    static boolean solution(int[][] connections) {
        for (int i = 0; i < connections.length; i++) {
            if(dft(connections, i, new HashSet<Integer>())) {
                return true;
            }
        }
        return false;
    }

    static boolean dft(int[][] connections, int start, HashSet<Integer> visited) {
        if (visited.contains(start)) return true;

        HashSet<Integer> newVisited = new HashSet<Integer>(visited);
        newVisited.add(start);

        for(int i: connections[start]) {
            boolean cyclic = dft(connections, i , newVisited);
            if(cyclic) return true;
        }

        newVisited.remove(start);
        return false;
    }

    public static void main(String[] args) {
        int[][] connections = new int[][] { {1}, {2}, {3,4}, {4}, {0} };
        System.out.println(solution(connections));

        connections = new int[][] { {1}, {2}, {3,4}, {4}, {} };
        System.out.println(solution(connections));
    }
}


