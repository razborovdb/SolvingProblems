package org.binarysearchtree.search;

public class SearchBinarySearchTree {
    boolean solution(Tree<Integer> root, int value) {
        if (root == null) return false;;
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
