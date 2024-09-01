package training3.stackqueue.queuefromtwostacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QueueFromTwoStacks {

    public static List<Integer> solution(String[] s) {
        List<Integer> sol = new ArrayList<>();
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();
        for(String next: s) {
            if(next.length() == 3) {
                if(left.isEmpty()) {
                    while (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                }
                if (!left.isEmpty()) {
                    sol.add(left.pop());
                }
            } else {
                right.push(Integer.parseInt(next.substring(5)));
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        List<Integer> sol = solution(new String[] {"push -6",
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
