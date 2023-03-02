package org.tree.searchtree;

public class SearchTree {
    boolean solution(Tree<Integer> root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        if (value > root.value) {
            return solution(root.right, value);
        }
        if (value < root.value) {
            return solution(root.left, value);
        }
        return false;
    }
}
