package training.tree.buildtree;

import java.util.*;

public class BuildTree {

    public static Tree<Integer> solution(int[] value) {
        Tree<Integer> result = new Tree<>(value[0]);

        for (int i = 1; i < value.length; i++) {
            insert(result, value[i]);
        }

        return result;
    }
    public static void insert(Tree<Integer> tree, int value) {
        Tree<Integer> cur = tree;
        Tree<Integer> newTree = new Tree<>(value);
        while (cur != null) {
            if (value > cur.value) {
                if (cur.right == null) {
                    cur.right = newTree;
                    return;
                }
                cur = cur.right;
            } else {
                if (cur.left == null) {
                    cur.left = newTree;
                    return;
                }
                cur = cur.left;
            }
        }
    }

    public static void main(String[] args) {
        int[] tree = new int[] {44,15,26,78,19,389,32};
        Tree<Integer> result = solution(tree);

        printTree(result);
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
