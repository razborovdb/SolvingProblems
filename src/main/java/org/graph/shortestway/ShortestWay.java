package org.graph.shortestway;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestWay {

    static int[] solution(int[][] adj_list, int start, int end) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        boolean[] visited = new boolean[adj_list.length];

        Queue<List<Integer>> queue = new LinkedList<List<Integer>>();

        List<Integer> curList = new ArrayList<>();
        curList.add(start);
        queue.add(curList);

        while (!queue.isEmpty()) {
            curList = queue.poll();
            int cur = curList.get(curList.size()-1);
            if (!visited[cur]) {
                visited[cur] = true;
                for (int i: adj_list[cur]) {
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


        if (list.size() > 0) {
            int shortestIndex = 0;
            int shortestLength = list.get(0).size();
            printList(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                if (shortestLength > list.get(i).size()) {
                    shortestLength = list.get(i).size();
                    shortestIndex = i;
                }
                printList(list.get(i));
            }
            return list.get(shortestIndex).stream().mapToInt(Integer::intValue).toArray();
        }

        return new int[0];
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
