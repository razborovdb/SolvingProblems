package training6.graph.shortestway;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestWay {
    public static int[] solution(int[][] c, int start, int end) {
        List<List<Integer>> allWays = new ArrayList<>();
        List<Integer> way = new ArrayList<>();
        boolean[] isVisited = new boolean[c.length];
        way.add(start);

        Queue<List<Integer>> queue = new LinkedList<>();

        queue.add(way);

        while(!queue.isEmpty()) {
            List<Integer> curWay = queue.poll();
            int next = curWay.get(curWay.size()-1);

            if (!isVisited[next]) {
                isVisited[next] = true;
                for(int i : c[next]) {
                    if (i == end) {
                        List<Integer> nextWay = new ArrayList<>(curWay);
                        nextWay.add(i);
                        allWays.add(nextWay);
                    }
                    if(!isVisited[i]) {
                        List<Integer> nextWay = new ArrayList<>(curWay);
                        nextWay.add(i);
                        queue.add(nextWay);
                    }
                }
            }
        }



        int shortest = 0;
        int shortestLength = allWays.get(0).size();
        for(int i = 0; i < allWays.size(); i++) {
            if(shortestLength > allWays.get(i).size()) {
                shortestLength = allWays.get(i).size();
                shortest = i;
            }
        }


        return allWays.get(shortest).stream().mapToInt(Integer::intValue).toArray();



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
