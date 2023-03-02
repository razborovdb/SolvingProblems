package training2.graph.depthfirsttraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstTraversal {
    public static int[] solution (int[][] connections, int start) {
        List<Integer> list = new ArrayList<>();
        boolean[] isVisited = new boolean[connections.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while(!stack.isEmpty()) {
            int cur = stack.pop();

            if (!isVisited[cur]) {
                isVisited[cur] = true;
                list.add(cur);
                for (int i = connections[cur].length - 1; i >= 0; i --) {
                    if (!isVisited[connections[cur][i]]) {
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
