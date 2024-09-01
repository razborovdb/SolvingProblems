package org.tree.buildtree;

public class BuildTree {
    Tree<Integer> solution(int[] values) {
        if (values == null) return null;
        if (values.length == 0) return null;
        Tree<Integer> root = null;
        for (int i: values) {
            root = insert(root, i);
        }
        return root;
    }
    Tree<Integer> insert(Tree<Integer> root, int value) {
        if (root == null) return new Tree<Integer>(value);
        if (root.value == value) return root;
        if (value > root.value) {
            if (root.right == null) {
                root.right = new Tree<Integer>(value);
            } else {
                insert(root.right,value);
            }

        }

        if (value < root.value) {
            if (root.left == null) {
                root.left = new Tree<Integer>(value);
            } else {
                insert(root.left,value);
            }

        }

        return root;
    }
}
