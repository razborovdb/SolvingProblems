package amazon.reversedlinkedlist2;

public class ReversedLinkedList2 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;
        int curPosition = 1;
        ListNode tail = head;
        ListNode start = null;
        ListNode last = null;
        if (left > 1) {
            while (curPosition != (left - 1) && tail != null) {
                tail = tail.next;
                curPosition++;
            }

            if (tail == null) {
                return head;
            }
            start = tail;
            last = tail.next;
        } else {
            last = tail;
        }

        //if (last == null) return head;
        ListNode prev = null;
        ListNode cur = last;
        ListNode next =cur.next;

        while (curPosition < right && next != null) {
            prev = cur;
            cur = next;
            next = cur.next;
            cur.next = prev;
            curPosition++;
        }
        if (start != null) {
            start.next = prev;

            cur.next = next;
            last.next = cur;

            return head;
        } else {
            return cur;
        }

    }

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(3, listNode5);
        ListNode listNode3 = new ListNode(3,listNode4);
        ListNode listNode2 = new ListNode(2,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);

        ListNode result = reverseBetween(listNode4, 1,2);
        printListNode(result);
    }

    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "; ");
            head= head.next;
        }
        System.out.println();
    }
}
