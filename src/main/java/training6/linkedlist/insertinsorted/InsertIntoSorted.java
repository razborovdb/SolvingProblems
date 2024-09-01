package training6.linkedlist.insertinsorted;

public class InsertIntoSorted {
    public static ListNode<Integer> solution(ListNode<Integer> head, int target) {
        ListNode<Integer> prev = null;
        ListNode<Integer> cur = head;
        ListNode<Integer> insertNode = new ListNode<>(target);

        while(cur != null) {
            if(cur.value > target) {
                if(prev == null) {
                    insertNode.next = head;
                    return insertNode;
                }
                prev.next = insertNode;
                insertNode.next = cur;
                return head;
            }
            prev = cur;
            cur = prev.next;
        }
        prev.next = insertNode;

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

        ListNode<Integer> sol = solution(head, 7);
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
