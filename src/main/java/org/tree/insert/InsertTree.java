package org.tree.insert;

public class InsertTree {
    Tree<Integer> solution(Tree<Integer> root, int value) {
        if (root == null) return new Tree<Integer>(value);
        if (root.value == value) return root;
        if (root.value > value) {
            if (root.left == null) {
                root.left = new Tree<Integer>(value);
            } else {
                solution(root.left, value);
            }
        }

        if (root.value < value) {
            if (root.right == null) {
                root.right = new Tree<Integer>(value);
            } else {
                solution(root.right, value);
            }
        }


        return root;
    }
}
