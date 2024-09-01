package training.stackqueue.queuedlinkedlist;

public class QueuedLinkedList {


    public static ListNode<Integer> solution(String[] strings) {
        ListNode<Integer> head = null;
        ListNode<Integer> tail = null;

        for (String s: strings) {
            if (s.charAt(0) == 'e') {
                int i = Integer.parseInt(s.substring(2));
                ListNode<Integer> newList = new ListNode<>(i);
                if (head == null) {
                    head = newList;
                    tail = newList;
                } else {
                    tail.next = newList;
                }
            } else {
                if (head == null) continue;
                head = head.next;
                tail = head;
            }
        }

        return head;
    }
    public static void main(String[] args) {

        ListNode<Integer> sol = solution(new String[] {"e 12",
                "e 16",
                "e 18",
                "e 20",
                "e 22",
                "d",
                "e 10"});
        printNodes(sol);
    }

    public static void printNodes(ListNode<Integer> head) {
        ListNode<Integer> curNode = head;
        if (curNode == null) {
            System.out.println("null");
        }
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
}
