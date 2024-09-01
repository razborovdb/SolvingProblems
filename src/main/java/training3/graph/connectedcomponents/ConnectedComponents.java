package training3.graph.connectedcomponents;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents {

    public static int solution(int[][] c) {
        int result = 0;
        boolean[] isVisited = new boolean[c.length];
        for (int i = 0; i<c.length; i++) {
            if (!isVisited[i]) {
                result++;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                while(!queue.isEmpty()) {
                    int next = queue.poll();
                    if (!isVisited[next]) {
                        isVisited[next] = true;
                        for (int node: c[next]) {
                            if (!isVisited[node]) {
                                queue.add(node);
                            }
                        }
                    }
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[][] connections = new int[][] { {1,2}, {0}, {0}, {4}, {3} };
        System.out.println(solution(connections));

    }
}
