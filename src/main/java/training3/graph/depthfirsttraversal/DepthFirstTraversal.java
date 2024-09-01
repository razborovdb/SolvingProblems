package training3.graph.depthfirsttraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstTraversal {

    public static int[] solution(int[][] c, int start) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        boolean[] isVisited = new boolean[c.length];

        while(!stack.isEmpty()) {
            int cur = stack.pop();
            if (!isVisited[cur]) {
                list.add(cur);
                isVisited[cur] = true;

                for(int i=c[cur].length-1; i >=0 ;i--) {

                    if(!isVisited[c[cur][i]]) {

                        stack.push(c[cur][i]);
                    }
                }
            }
        }

        System.out.println();


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
