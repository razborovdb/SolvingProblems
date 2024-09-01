package org.binarysearchtree.breadthfirsttraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {
    int[] solution(Tree<Integer> root) {
        if (root == null) return new int[0];

        List<Integer> list = new ArrayList<Integer>();
        Queue<Tree<Integer>> queue = new LinkedList<Tree<Integer>>();
        queue.add(root);
        while (queue.size() != 0) {
            Tree<Integer> next = queue.poll();
            list.add(next.value);
            if(next.left != null) {
                queue.add(next.left);
            }
            if (next.right != null) {
                queue.add(next.right);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
