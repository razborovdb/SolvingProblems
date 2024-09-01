package org.binarysearchtree.inordertraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InOrderTraversal {
    int[] solution(Tree<Integer> root) {
        if (root == null) return new int[0];

        List<Integer> list = new ArrayList<>();
        list = search(list, root);
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    List<Integer> search(List<Integer> list, Tree<Integer> root) {
        if (root == null) return list;
        list.add(root.value);
        if (root.left != null) {
            list = search(list, root.left);
        }
        if (root.right != null) {
            list = search(list, root.right);
        }
        return list;
    }
}
