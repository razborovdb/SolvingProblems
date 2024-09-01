package org.graph.depthfirsttraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstTraversal {
    static int[] solution(int[][] adj_list, int start) {
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[adj_list.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int cur = stack.pop();

            if (!visited[cur]) {
                list.add(cur);
                visited[cur] = true;
                for (int i = adj_list[cur].length-1; i >= 0; i--) {
                    if (!visited[adj_list[cur][i]]) {
                        stack.push(adj_list[cur][i]);
                    }
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        int[][] connections = new int[][] { {1}, {2,3}, {4}, {}, {0} };
        print(solution(connections,0));

    }

    public static void print(int[] result) {
        for (int i: result) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
