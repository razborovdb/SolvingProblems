package training.binarysearchtree.inordertraversal;

import java.util.*;

public class InOrderTraversal {
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
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println(solutionLevel(tree, targetValue, 0));


        System.out.println("______________");
        printTree(tree);
    }

    public static int[] solution(Tree<Integer> tree) {
        List<Integer> list =  new ArrayList<>();


        return recursion(list, tree).stream().mapToInt(Integer::intValue).toArray();
    }

    public static List<Integer> recursion(List<Integer> list, Tree<Integer> tree) {
        if (tree == null) {
            return list;
        }
        list.add(tree.value);
        if (tree.left != null) {
            recursion(list, tree.left);
        }
        if (tree.right != null) {
            recursion(list, tree.right);
        }

        return list;
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
