package leetcode.ReverseNodesIn_k_Group;

public class ReverseNodesIn_k_Group {

    public static void main(String[] args) {
        ListNode n5 =  new ListNode(5);
        ListNode n4 =  new ListNode(4, n5);
        ListNode n3 =  new ListNode(3, n4);
        ListNode n2 =  new ListNode(2, n3);
        ListNode n1 =  new ListNode(1, n2);

        ListNode result = reverseKGroup(n1, 3);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode cur = head;
        ListNode next = null;
        ListNode prev = null;

        int count = 0;

        while (count < k && cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }
        if (count < k) {
            while (count > 0 ) {
                next = cur;
                cur = prev;
                prev = cur.next;
                cur.next = next;

                count--;
            }
            return head;
        }

        if (next != null) {
            head.next = reverseKGroup(next, k);
        }


        return prev;


    }
}
