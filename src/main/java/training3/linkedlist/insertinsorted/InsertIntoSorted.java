package training3.linkedlist.insertinsorted;

public class InsertIntoSorted {

    public static ListNode<Integer> solution(ListNode<Integer> head, int target) {

        ListNode<Integer> ins = new ListNode<>(target);

        if (head.value >= target) {
            ins.next = head;
            return ins;
        }

        ListNode<Integer> prev = head;
        ListNode<Integer> cur = head.next;

        while(cur != null) {
            if (cur.value >= target) {
                prev.next = ins;
                ins.next = cur;
                return head;
            }
            prev = cur;
            cur = cur.next;
        }

        prev.next = ins;
        return head;
    }
    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(3);
        ListNode<Integer> next2 = new ListNode<>(8);
        ListNode<Integer> tail = new ListNode<>(10);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> sol = solution(head, 11);
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
