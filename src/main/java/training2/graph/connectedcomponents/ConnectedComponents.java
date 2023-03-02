package training2.graph.connectedcomponents;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents {
    public static int solution(int[][] connections) {
        int numConnections = 0;
        boolean[] isVisited = new boolean[connections.length];

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < connections.length; i++) {
            if (!isVisited[i]) {
                numConnections++;
                queue.add(i);
                while (!queue.isEmpty()) {
                    int cur = queue.poll();
                    if (!isVisited[cur]) {
                        isVisited[cur] = true;
                        for (int j : connections[cur]) {
                            queue.add(j);
                        }
                    }
                }
            }

        }

        return numConnections;
    }


    public static void main(String[] args) {
        int[][] connections = new int[][] { {1,2}, {0}, {0}, {4}, {3} };
        System.out.println(solution(connections));

    }
}
