package training.graph.depthfirsttraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstTraversal {

    public static int[] solution(int[][] connections, int start) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[connections.length];

        stack.push(start);
        while (!stack.isEmpty()) {
            int cur = stack.pop();

            if (!visited[cur]) {
                visited[cur] = true;
                list.add(cur);
                for (int i=connections[cur].length - 1; i>=0; i--) {
                    if (!visited[connections[cur][i]]) {
                        stack.push(connections[cur][i]);
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
