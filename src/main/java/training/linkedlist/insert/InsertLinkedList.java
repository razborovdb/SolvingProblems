package training.linkedlist.insert;

public class InsertLinkedList {
    public static ListNode<Integer> solution(ListNode<Integer> head, int value, int index) {
        ListNode<Integer> newNode = new ListNode<>(value);
        if (index <= 0) {
            newNode.next = head;
            return newNode;
        }
        ListNode<Integer> prev = head;
        ListNode<Integer> cur = head.next;
        int i = 1;

        while (cur != null) {
            if (index == i) {
                prev.next = newNode;
                newNode.next = cur;
                return head;
            }
            prev = cur;
            cur = cur.next;
            i++;
        }
        prev.next = newNode;
        newNode.next = cur;
        return head;

    }

    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<Integer>(1);
        ListNode<Integer> next1 = new ListNode<Integer>(2);
        ListNode<Integer> tail = new ListNode<Integer>(3);

        head.next = next1;
        next1.next = tail;

        ListNode<Integer> sol = solution(head, 99, 1);
        printNodes(sol);

    }
    public static void printNodes(ListNode<Integer> head) {
        ListNode<Integer> curNode = head;
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
}
