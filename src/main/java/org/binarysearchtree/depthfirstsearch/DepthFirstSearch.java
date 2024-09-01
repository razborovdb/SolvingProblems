package org.binarysearchtree.depthfirstsearch;

import java.util.Stack;

public class DepthFirstSearch {


    public void traverse(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while(!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.add(current);
                current = current.getLeft();
            } else {
                current = stack.pop();
                System.out.println(current.getValue());
                current = current.getRight();
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.traverse(root);  //4, 2, 5, 1, 6, 3,
    }
}
