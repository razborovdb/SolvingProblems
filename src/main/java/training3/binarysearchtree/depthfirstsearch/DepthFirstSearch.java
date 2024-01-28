package training3.binarysearchtree.depthfirstsearch;

import java.util.*;

public class DepthFirstSearch {

    public static boolean solution(Node tree, int target) {

        Stack<Node> stack = new Stack<>();

        stack.push(tree);

        while(!stack.isEmpty()) {
            Node next = stack.pop();
            if (next.getValue() == target) {
                return true;
            }

            if (next.getRight() != null) {
                stack.push(next.getRight());
            }
            if (next.getLeft() != null) {
                stack.push(next.getLeft());
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Integer level = 0;
        Node tree = new Node(25);
        Node treeL = new Node(17);
        Node treeR = new Node(42);
        tree.setLeft(treeL);
        tree.setRight(treeR);
        Node treeL_L = new Node(15);
        Node treeL_R = new Node(19);
        treeL.setLeft(treeL_L);
        treeL.setRight(treeL_R);
        Node treeR_L = new Node(40);
        Node treeR_R = new Node(44);
        treeR.setLeft(treeR_L);
        treeR.setRight(treeR_R);

        int targetValue = 44;

        System.out.println(solution(tree, targetValue));
        System.out.println();
        System.out.println(solutionLevel(tree, targetValue, 0));


        System.out.println("______________");
        printTree(tree);
    }
    public static void  printTree(Node tree) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        int startLevel = 0;

        queue.add(tree);

        while (!queue.isEmpty()) {
            Node curTree = queue.poll();
            int level = solutionLevel(tree, curTree.getValue(), 0);
            if (map.containsKey(level)) {
                map.get(level).add(curTree.getValue());
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(curTree.getValue());
                map.put(level, list);
            }
            //System.out.println(curTree.value);
            if (curTree != null) {
                if (curTree.getLeft() != null) {
                    queue.add(curTree.getLeft());
                }
                if (curTree.getRight() != null) {
                    queue.add(curTree.getRight());
                }
            }
        }

        for (int i = 0; i < map.size(); i++) {
            List<Integer> list = map.get(i);
            for (int j : list) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public static int solutionLevel(Node tree, int targetValue, Integer level) {

        if (tree == null) {
            return -1;
        }
        if (tree.getValue() == targetValue) return level;
        level = level + 1;
        if (tree.getValue() > targetValue) {
            return solutionLevel(tree.getLeft(), targetValue, level);
        }
        else return solutionLevel(tree.getRight(), targetValue, level);

    }
}
