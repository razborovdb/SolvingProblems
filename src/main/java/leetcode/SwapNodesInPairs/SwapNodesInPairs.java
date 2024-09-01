package leetcode.SwapNodesInPairs;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode n4 =  new ListNode(4);
        ListNode n3 =  new ListNode(3, n4);
        ListNode n2 =  new ListNode(2, n3);
        ListNode n1 =  new ListNode(1, n2);


        ListNode result = swapPairs(n1);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode next = head.next;

        while (next != null) {
            int val = cur.val;
            cur.val = next.val;
            next.val = val;
            cur = next.next;
            if (cur != null) {
                next = cur.next;
            } else {
                next = null;
            }

        }

        return head;


    }
}
