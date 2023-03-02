package training2.graph.shortestway;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestWay {

    public static int[] solution(int[][] connections, int start, int end) {
        List<List<Integer>> ways = new ArrayList<>();
        List<Integer> way = new ArrayList<>();
        way.add(start);
        boolean[] isVisited = new boolean[connections.length];
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(way);

        while (!queue.isEmpty()) {
            List<Integer> list = queue.poll();
            int cur = list.get(list.size()-1);
            if (cur == end) {
                List<Integer> curWay = new ArrayList<>(list);
                ways.add(curWay);
                continue;
            }
            if (!isVisited[cur]) {
                isVisited[cur] = true;
                for (int i: connections[cur]) {
                    if (!isVisited[i]) {
                        List<Integer> curWay = new ArrayList<>(list);
                        curWay.add(i);
                        queue.add(curWay);
                    }
                }
            }


        }

        for (int i = 0; i < ways.size(); i++) {
            printList(ways.get(i));
        }

        System.out.println("-----------------------------");
        if (ways.isEmpty()) return null;
        int minIndex = 0;
        int shortest = ways.get(0).size();

        for (int i = 1; i < ways.size(); i++) {
            if (ways.get(i).size() < shortest) {
                shortest = ways.get(i).size();
                minIndex = i;
            }
        }

        return  ways.get(minIndex).stream().mapToInt(Integer::intValue).toArray();

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
