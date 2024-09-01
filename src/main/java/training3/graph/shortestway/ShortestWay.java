package training3.graph.shortestway;

import java.util.*;

public class ShortestWay {


    public static int[] solution(int[][] c, int start, int end) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] isVisited = new boolean[c.length];
        Queue<List<Integer>> queue = new LinkedList<>();

        List<Integer> way = new ArrayList<>();
        way.add(start);
        queue.add(way);
        while(!queue.isEmpty()) {
            way = queue.poll();
            int node = way.get(way.size()-1);

            if (!isVisited[node]) {
                isVisited[node] = true;
                for (int i : c[node]) {
                    if (i == end) {
                        List<Integer> newList = new ArrayList<>(way);
                        newList.add(i);
                        list.add(newList);
                    }

                    if (!isVisited[i]) {
                        List<Integer> newList = new ArrayList<>(way);
                        newList.add(i);
                        queue.add(newList);
                    }
                }

            }


        }
        if (list.isEmpty()) return new int[] {};
        int shortest = 0;
        int shortestLength = list.get(0).size();

        for (int i = 0; i < list.size();i++) {
            printList(list.get(i));
            if (list.get(i).size() < shortestLength) {
                shortestLength = list.get(0).size();
                shortest = i;
            }
        }

        System.out.println("--------------------------------------");

        return list.get(shortest).stream().mapToInt(Integer::intValue).toArray();
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
