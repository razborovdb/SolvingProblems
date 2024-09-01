package training.graph.breadthfirsttraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {

    static int[] solution(int[][] adj_list, int start) {
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[adj_list.length];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()) {
            int i = queue.poll();
            if (!visited[i]) {
                visited[i] = true;
                list.add(i);
                for (int j : adj_list[i]) {
                    if (!visited[j]) {
                        queue.add(j);
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
