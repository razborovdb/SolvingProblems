package training6.graph.depthfirsttraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstTraversal {

    public static int[] solution(int[][] c, int start) {
        List<Integer> result = new ArrayList<>();

        boolean[] isVisited = new boolean[c.length];

        Stack<Integer> stack = new Stack<>();

        stack.add(start);

        while(!stack.isEmpty()) {
            int next = stack.pop();
            if(!isVisited[next]) {
                isVisited[next] = true;
                result.add(next);

                for (int i = c[next].length-1; i >=0 ; i--) {

                    if(!isVisited[c[next][i]]) {
                        stack.push(c[next][i]);
                    }
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
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
