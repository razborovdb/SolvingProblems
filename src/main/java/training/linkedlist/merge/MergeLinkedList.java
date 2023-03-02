package training.linkedlist.merge;

public class MergeLinkedList {
    public static ListNode<Integer> solution(ListNode<Integer> node1, ListNode<Integer> node2) {
        ListNode<Integer> newNode = new ListNode<>(0);
        if (node1.value > node2.value) {
            newNode = node2;
            node2 = node2.next;
        } else {
            newNode = node1;
            node1 = node1.next;
        }
        ListNode<Integer> cur = newNode;
        while (node1 != null && node2 != null) {
            if (node1.value > node2.value) {
                cur.next = node2;
                node2 = node2.next;
            } else {
                cur.next = node1;
                node1 = node1.next;
            }
            cur = cur.next;

        }

        if (node1 != null) {
            cur.next = node1;
        }

        if (node2 != null) {
            cur.next = node2;
        }

        return newNode;
    }


    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(19);
        ListNode<Integer> next2 = new ListNode<>(145);
        ListNode<Integer> tail = new ListNode<>(543);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> head2 = new ListNode<>(14);
        ListNode<Integer> next21 = new ListNode<>(16);
        ListNode<Integer> next22 = new ListNode<>(123);
        ListNode<Integer> tail2 = new ListNode<>(432);

        head2.next = next21;
        next21.next = next22;
        next22.next = tail2;

        ListNode<Integer> sol = solution(head2, head);
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
