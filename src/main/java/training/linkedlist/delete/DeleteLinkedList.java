package training.linkedlist.delete;



public class DeleteLinkedList {

    public static ListNode<Integer> solution(ListNode<Integer> head, int num) {
        if (head == null) return head;
        if (head.value == num) return head.next;
        ListNode<Integer> prev = head;
        ListNode<Integer> cur = head.next;

        while (cur != null) {
            if (cur.value == num) {
                prev.next = cur.next;
                return head;
            }
            prev = cur;
            cur = cur.next;
        }
        return head;
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

        ListNode<Integer> sol = solution(head, 6);
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
