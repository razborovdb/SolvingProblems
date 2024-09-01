package training4.shortestway;

import java.util.*;

public class ShortestWay {

    public static int[] solution(int[][] c, int start, int end) {
        List<List<Integer>> ways = new ArrayList<>();
        boolean[] isVisited = new boolean[c.length];
        List<Integer> way = new ArrayList<>();
        way.add(start);
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(way);

        while(!queue.isEmpty()) {
            List<Integer> curWay = queue.poll();
            int node = curWay.get(curWay.size()-1);
            if (!isVisited[node]) {
                isVisited[node] = true;
                for (int i: c[node]) {
                    if (i == end) {
                        List<Integer> newWay = new ArrayList<>(curWay);
                        newWay.add(i);
                        ways.add(newWay);
                    }

                    if(!isVisited[i]) {
                        List<Integer> newWay = new ArrayList<>(curWay);
                        newWay.add(i);
                        queue.add(newWay);
                    }
                }
            }

        }

        if(!ways.isEmpty()) {
//            for(int i =0; i < ways.size(); i++) {
//                printList(ways.get(i));
//            }

            List<Integer> result = ways.get(0);

            for (List<Integer> nextWay: ways) {
                if(nextWay.size() < result.size()) {
                    result = nextWay;
                }
            }
            return result.stream().mapToInt(Integer::intValue).toArray();
        }

        return null;



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
