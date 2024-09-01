package training3.binarysearchtree.breadthfirsttraversal;

import java.util.*;

public class BreadthFirstTraversal {

    public static int[] solution(Tree<Integer> tree) {
        List<Integer> list = new ArrayList<>();

        Queue<Tree> queue = new LinkedList<>();

        queue.add(tree);

        while (!queue.isEmpty()) {
            Tree<Integer> next = queue.poll();
            list.add(next.value);
            if (next.left != null) {
                queue.add(next.left);
            }
            if (next.right != null) {
                queue.add(next.right);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        Integer level = 0;
        Tree<Integer> tree = new Tree<>(25);
        Tree<Integer> treeL = new Tree<>(17);
        Tree<Integer> treeR = new Tree<>(42);
        tree.left = treeL;
        tree.right = treeR;
        Tree<Integer> treeL_L = new Tree<>(15);
        Tree<Integer> treeL_R = new Tree<>(19);
        treeL.left = treeL_L;
        treeL.right = treeL_R;
        Tree<Integer> treeR_L = new Tree<>(40);
        Tree<Integer> treeR_R = new Tree<>(44);
        treeR.left = treeR_L;
        treeR.right = treeR_R;

        int targetValue = 44;
        int[] result = solution(tree);
        for (int i: result) {
            System.out.println(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println(solutionLevel(tree, targetValue, 0));


        System.out.println("______________");
        printTree(tree);
    }

    public static void  printTree(Tree<Integer> tree) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Tree> queue = new LinkedList<>();
        int startLevel = 0;

        queue.add(tree);

        while (!queue.isEmpty()) {
            Tree<Integer> curTree = queue.poll();
            int level = solutionLevel(tree, curTree.value, 0);
            if (map.containsKey(level)) {
                map.get(level).add(curTree.value);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(curTree.value);
                map.put(level, list);
            }
            //System.out.println(curTree.value);
            if (curTree != null) {
                if (curTree.left != null) {
                    queue.add(curTree.left);
                }
                if (curTree.right != null) {
                    queue.add(curTree.right);
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

    public static int solutionLevel(Tree<Integer> tree, int targetValue, Integer level) {

        if (tree == null) {
            return -1;
        }
        if (tree.value == targetValue) return level;
        level = level + 1;
        if (tree.value > targetValue) {
            return solutionLevel(tree.left, targetValue, level);
        }
        else return solutionLevel(tree.right, targetValue, level);

    }
}
