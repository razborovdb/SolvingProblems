package training3.stackqueue.queuedlinkedlist;

public class QueuedLinkedList {

    public static ListNode<Integer> solution(String[] s) {
        ListNode<Integer> head = null;
        ListNode<Integer> tail = null;
        for(String next: s) {
            if (next.length() == 1) {
                if (head == null) {
                    continue;
                } else {
                    head = head.next;
                    if (head == null) tail = null;
                }
            } else {
                int i = Integer.parseInt(next.substring(2));
                ListNode<Integer> listNode = new ListNode<>(i);
                if (head == null) {
                    head = listNode;
                    tail = listNode;
                } else {
                    tail.next = listNode;
                    tail = tail.next;
                }
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
