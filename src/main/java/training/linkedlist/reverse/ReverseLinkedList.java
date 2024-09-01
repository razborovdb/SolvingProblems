package training.linkedlist.reverse;

public class ReverseLinkedList {

    public static ListNode<Integer> solution(ListNode<Integer> head) {
        ListNode<Integer> prev = null;
        ListNode<Integer> cur = head;
        ListNode<Integer> next = head.next;
        cur.next = prev;
        while (next != null) {
            prev = cur;
            cur = next;
            next = cur.next;
            cur.next = prev;
        }
        return cur;
    }

    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(3);
        ListNode<Integer> next2 = new ListNode<>(4);
        ListNode<Integer> tail = new ListNode<>(6);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> sol = solution(head);
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
