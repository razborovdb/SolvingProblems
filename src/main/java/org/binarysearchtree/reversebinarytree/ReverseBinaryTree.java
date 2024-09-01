package org.binarysearchtree.reversebinarytree;

public class ReverseBinaryTree {
    Tree<Integer> solution(Tree<Integer> root) {
        if (root == null) return root;

        Tree<Integer> right = root.right;
        root.right = root.left;
        root.left = right;
        if (root.right != null) {
            solution(root.right);
        }
        if (root.left != null) {
            solution(root.left);
        }

        return root;
    }
}
