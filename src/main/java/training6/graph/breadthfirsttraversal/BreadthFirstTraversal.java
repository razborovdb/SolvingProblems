package training6.graph.breadthfirsttraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {
    public static int[] solution(int[][] c, int start) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[c.length];
        queue.add(start);

        while(!queue.isEmpty()) {
            int next = queue.poll();
            if(!isVisited[next]) {
                isVisited[next] = true;
                result.add(next);
                for(int i: c[next]) {
                    if(!isVisited[i]) {
                        queue.add(i);
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
