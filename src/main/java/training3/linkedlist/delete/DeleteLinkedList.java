package training3.linkedlist.delete;

public class DeleteLinkedList {

    public static ListNode<Integer> solution(ListNode<Integer> head, int index) {
        if (index < 0) return null;
        if (index == 0) return head.next;

        int i = 1;
        ListNode<Integer> prev = head;
        ListNode<Integer> cur = head.next;
        while (i <= index) {

            if (cur == null) return null;
            if (i == index) {
                prev.next = cur.next;
                return head;
            }
            prev = cur;
            cur = cur.next;
            i++;
        }
        return null;

    }

    public static void main(String[] args) {
        DeleteLinkedList deleteLinkedList = new DeleteLinkedList();
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(3);
        ListNode<Integer> next2 = new ListNode<>(4);
        ListNode<Integer> tail = new ListNode<>(6);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> sol = solution(head, 4);
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
