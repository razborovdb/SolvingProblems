package training.graph.connectedcomponents;

import java.util.Stack;

public class ConnectedComponents {

    public static int solution(int[][] connections) {
        boolean[] visited = new boolean[connections.length];
        Stack<Integer> stack =  new Stack<>();
        int count = 0;

        for (int i = 0; i < connections.length; i++) {
            if (!visited[i]) {
                count++;
                stack.push(i);
                while (!stack.isEmpty()) {
                    int cur = stack.pop();
                    if(!visited[cur]) {
                        visited[cur] = true;
                        for (int j : connections[cur]) {
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
