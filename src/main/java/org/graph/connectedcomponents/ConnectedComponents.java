package org.graph.connectedcomponents;

import java.util.Stack;

public class ConnectedComponents {
    static int solution(int[][] adj_list) {

        int count = 0;
        boolean[] visited = new boolean[adj_list.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < adj_list.length; i++) {
            if (!visited[i]) {
                count++;
                stack.push(i);
                while (!stack.isEmpty()) {
                    int cur = stack.pop();
                    if (!visited[cur]) {
                        visited[cur] = true;
                        for (int j: adj_list[cur]) {
                            if (!visited[j]) {
                                stack.push(j);
                            }
                        }
                    }
                }
            }

        }


        return count;
    }

    public static void main(String[] args) {
        int[][] connections = new int[][] { {1,2}, {0}, {0}, {4}, {3} };
        System.out.println(solution(connections));

    }
}
