package training2.graph.breadthfirsttraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {
    public static int[] solution(int[][] connections, int start) {
        List<Integer> list = new ArrayList<>();
        boolean[] isVisited = new boolean[connections.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int curNode = queue.poll();
            if (!isVisited[curNode]) {
                isVisited[curNode] = true;
                list.add(curNode);
                for (int i: connections[curNode]) {
                    if (!isVisited[i]) {
                        queue.add(i);
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
