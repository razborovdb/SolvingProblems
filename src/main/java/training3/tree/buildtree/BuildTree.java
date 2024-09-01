package training3.tree.buildtree;

import java.util.*;

public class BuildTree {

    public static Tree<Integer> solution(int[] array) {
        if(array.length == 0) {
            return null;
        }
    //    Tree<Integer> result = new Tree<>(array[0]);
        Tree<Integer> result = null;
        for(int i = 0; i<array.length; i++) {
            result = insert(result, array[i]);
        }
        return result;
    }

    public static Tree<Integer> insert(Tree<Integer> result, int value) {
        if (result == null) {
            return new Tree<>(value);
        }
        if (result.value == value) {
            return result;
        }
        if (result.value > value) {
            result.left = insert(result.left, value);
        } else {
            result.right = insert(result.right, value);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {3, 5, 7, 9, 1, 16};
        Tree<Integer>  result = solution(array);

        printTree(result);
    }

    public static void  printTree(Tree<Integer> tree) {
        if(tree == null) {
            return;
        }
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
