package org.stackqueue.queuefromtwostacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QueueFromTwoStacks {
    Stack<Integer> left;
    Stack<Integer> right;

    void insert(int x) {
        left.push(x);
    }

    int remove() {
        if (right.size() == 0) {
            while(left.size() > 0) {
                int i = left.pop();
                right.push(i);
            }
        }
        if (right.size() == 0) {
            return -1;
        }
        return right.pop();
    }

    List<Integer> solution(String[] requests) {
        left = new Stack<>();
        right = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (String request : requests) {
            String[] req = request.split(" ");
            if (req[0].equals("push")) {
                insert(Integer.parseInt(req[1]));
            } else {
                ans.add(remove());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        QueueFromTwoStacks queueFromTwoStacks = new QueueFromTwoStacks();
        List<Integer> sol = queueFromTwoStacks.solution(new String[] {"push -6",
                "push -8",
                "push -9",
                "push 0",
                "push 9",
                "pop",
                "pop",
                "pop",
                "pop",
                "pop"});
        // [-6, -8, -9, 0, 9]
        printNodes(sol);
    }

    public static void printNodes(List<Integer> head) {
        for (int i: head) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
