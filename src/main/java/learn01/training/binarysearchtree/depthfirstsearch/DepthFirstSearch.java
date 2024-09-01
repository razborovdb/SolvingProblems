package learn01.training.binarysearchtree.depthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class DepthFirstSearch {
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

        int targetValue = 42;

        System.out.println(solution(tree, targetValue));
        System.out.println();


        System.out.println("______________");
        printTree(tree);
    }

    public static void printTree(Node tree) {
        Queue<Node> queue = new LinkedList<>();
        Queue<Integer> levelQueue = new LinkedList<>();
        Integer curLevel = 0;
        queue.add(tree);
        levelQueue.add(curLevel);
        while (!queue.isEmpty() && !levelQueue.isEmpty()) {
            Node curTree = queue.poll();
            Integer level = levelQueue.poll();
            if (level != curLevel) {
                System.out.println();
                curLevel = level;
            }
            System.out.print(" " + curTree.getValue());
            if (curTree.getLeft() != null) {
                queue.add(curTree.getLeft());
                levelQueue.add(level + 1);
            }
            if (curTree.getRight() != null) {
                queue.add(curTree.getRight());
                levelQueue.add(level + 1);
            }
        }
    }

    public static boolean solution(Node tree, Integer targetValue) {
        if (tree == null) {
            return false;
        }
        if (targetValue == tree.getValue()) {
            return true;
        }
        if (tree.getLeft() != null) {
            boolean result = solution(tree.getLeft(), targetValue);
            if (result) {
                return true;
            } else {
                return solution(tree.getRight(), targetValue);
            }
        } else {
             return solution(tree.getRight(), targetValue);
        }
    }
}
