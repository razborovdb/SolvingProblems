package training.graph.shortestway;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestWay {

    public static int[] solution(int[][] connections, int start, int end) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[connections.length];
        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> curList = new ArrayList<>();
        curList.add(start);
        queue.add(curList);
        while (!queue.isEmpty()) {
            curList = queue.poll();
            int cur = curList.get(curList.size()-1);
            if (!visited[cur]) {
                visited[cur] = true;
                for (int i: connections[cur]) {
                    if (i == end) {
                        List<Integer> newList = new ArrayList<>(curList);
                        newList.add(i);
                        list.add(newList);
                    }

                    if (!visited[i]) {
                        List<Integer> newList = new ArrayList<>(curList);
                        newList.add(i);
                        queue.add(newList);
                    }
                }
            }
        }
        int shortestIndex = 0;
        int shortestSize = list.get(0).size();

        for (int i = 0; i < list.size(); i++) {
            printList(list.get(i));
            if (list.get(i).size() < shortestSize) {
                shortestSize = list.get(i).size();
                shortestIndex = i;
            }
        }
        return list.get(shortestIndex).stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[][] connections = new int[][] { {4,6}, {4,2,6}, {3,1}, {4,2,5}, {1,0,3}, {3}, {0,1}, {} };
        System.out.println();
        print(solution(connections,3, 0));
    }

    public static void print(int[] result) {
        for (int i: result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printList(List<Integer> result) {
        for (int i: result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
