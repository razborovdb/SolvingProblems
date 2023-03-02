package training.stackqueue.queuefromtwostacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QueueFromTwoStacks {

    static Stack<Integer> left;
    static Stack<Integer> right;

    public static void insert(int value) {
        left.push(value);
    }

    public static int remove() {
        if (right.isEmpty()) {
            while (!left.isEmpty()) {
                right.push(left.pop());
            }
        }
        if (right.isEmpty()) {
            return -1;
        }

        return right.pop();

    }

    public static List<Integer> solution(String[] strings) {
        List<Integer> list = new ArrayList<>();
        left = new Stack<>();
        right = new Stack<>();

        for (String request: strings) {
            String[] req = request.split(" ");
            if (req[0].equals("push")) {
                insert(Integer.parseInt(req[1]));
            } else {
                list.add(remove());
            }
        }

        return list;

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
